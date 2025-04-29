package org.example.repository;

import org.example.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    List<EmployeeEntity> findByName(String name);

    List<EmployeeEntity> findByDepartment(String department);

    List<EmployeeEntity> findByEmail(String email);

    // Custom query methods can be defined here if needed
    // For example, find employees by name or department
    // List<EmployeeEntity> findByName(String name);
    // List<EmployeeEntity> findByDepartment(String department);
}
