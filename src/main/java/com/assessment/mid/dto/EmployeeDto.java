package com.assessment.mid.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class EmployeeDto {
    private Long empId;

    @NotBlank(message = "Employee name is required")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Size(min = 5, message = "Employee name must be at least 5 characters")
    private String email;

    @NotNull(message = "Department is required")
    private DepartmentDto department;


}
