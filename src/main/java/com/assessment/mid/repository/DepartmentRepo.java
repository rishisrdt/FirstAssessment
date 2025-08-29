package com.assessment.mid.repository;

import com.assessment.mid.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Long> {
    boolean existsByDeptName(String deptName);
}