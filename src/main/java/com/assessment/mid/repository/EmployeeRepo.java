package com.assessment.mid.repository;


import com.assessment.mid.dto.EmployeeDto;
import com.assessment.mid.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartmentDeptId(Long deptId);

    boolean existsByEmail(String email);

    // Use native query to persist data in Employee Table

    @Modifying
    @Transactional
    @Query( value = "INSERT INTO employee (name, email, department_id) VALUES (:name, :email, :deptId)", nativeQuery = true)
    void createEmployee(@Param("name") String name, @Param("email") String email, @Param("deptId") Long deptId);


}


