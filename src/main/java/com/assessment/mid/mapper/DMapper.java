package com.assessment.mid.mapper;

import com.assessment.mid.dto.DepartmentDto;
import com.assessment.mid.entity.Department;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class DMapper {

    public Department toEntity(DepartmentDto dto) {
        if (dto == null) return null;
        Department dept = new Department();
        dept.setDeptId(dto.getDeptId());
        dept.setDeptName(dto.getDeptName());

        return dept;
    }

    public DepartmentDto toDto(Department dept) {
        if (dept == null) return null;
        DepartmentDto dto = new DepartmentDto();
        dto.setDeptId(dept.getDeptId());
        dto.setDeptName(dept.getDeptName());

        return dto;
    }


}
