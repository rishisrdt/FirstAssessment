package com.assessment.mid.controller;


import com.assessment.mid.dto.DepartmentDto;
import com.assessment.mid.service.DepartmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/assessment")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {

        this.departmentService = departmentService;
    }


    @PostMapping
    public DepartmentDto addDepartment( @RequestBody DepartmentDto dto) {
        return departmentService.addDepartment(dto);
    }

}