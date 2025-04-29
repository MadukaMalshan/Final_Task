package org.example.service;

import org.example.dto.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>  getAllEmployees();
    Employee getEmployeeById(Long id);
    void createEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(Long id);
}
