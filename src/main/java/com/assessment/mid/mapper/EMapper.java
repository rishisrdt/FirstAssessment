package com.assessment.mid.mapper;

import com.assessment.mid.dto.DepartmentDto;
import com.assessment.mid.dto.EmployeeDto;
import com.assessment.mid.entity.Department;
import com.assessment.mid.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EMapper {

    public static Employee toEntity(EmployeeDto dto) {
        if (dto == null) return null;

        Employee emp = new Employee();
        emp.setName(dto.getName());
        emp.setEmail(dto.getEmail());

        if (dto.getDepartment() != null) {
            Department dept = new Department();
            dept.setDeptId(dto.getDepartment().getDeptId());
            dept.setDeptName(dto.getDepartment().getDeptName());
            emp.setDepartment(dept);
        }

        return emp;
    }

    public static EmployeeDto toDto(Employee emp) {
        if (emp == null) return null;

        EmployeeDto dto = new EmployeeDto();
        dto.setEmpId(emp.getId());
        dto.setName(emp.getName());
        dto.setEmail(emp.getEmail());

        if (emp.getDepartment() != null) {
            DepartmentDto deptDto = new DepartmentDto();
            deptDto.setDeptId(emp.getDepartment().getDeptId());
            deptDto.setDeptName(emp.getDepartment().getDeptName());
            dto.setDepartment(deptDto);
        }

        return dto;
    }

    public static java.util.List<EmployeeDto> toDtoList(java.util.List<Employee> employees) {
        return employees != null
                ? employees.stream().map(EMapper::toDto).toList()
                : new java.util.ArrayList<>();
    }
}
