package com.assessment.mid.service;

import com.assessment.mid.dto.DepartmentDto;
import com.assessment.mid.entity.Department;
import com.assessment.mid.mapper.DMapper;
import com.assessment.mid.repository.DepartmentRepo;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private final DepartmentRepo departmentRepo;
    private final DMapper dMapper;

    public DepartmentService(DepartmentRepo departmentRepo, DMapper dMapper) {
        this.departmentRepo = departmentRepo;
        this.dMapper = dMapper;
    }

    public DepartmentDto addDepartment(DepartmentDto dto) {

        boolean exists = departmentRepo.existsByDeptName(dto.getDeptName());

        if (exists) {
            throw new RuntimeException("Department already exists" );
        }

        Department dept = dMapper.toEntity(dto);
        Department saved = departmentRepo.save(dept);
        return dMapper.toDto(saved);
    }

}
