package org.example.service.impl;

import org.example.dto.Employee;
import org.example.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService {
    @Override
    public List<Employee> getAllEmployees() {
        return List.of();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public void createEmployee(Employee employee) {

    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Long id) {

    }

    @Override
    public List<Employee> getEmployeesByName(String name) {
        return List.of();
    }

    @Override
    public List<Employee> getEmployeesByDepartment(String department) {
        return List.of();
    }

    @Override
    public List<Employee> getEmployeesByEmail(String email) {
        return List.of();
    }
    // This class is empty and serves as a placeholder for future implementation
    // or as a base class for other service implementations.
}
