package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.EmployeeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/supplier/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public void createEmployee() {

    }

    public void getAllEmployees() {

    }

    public void getEmployeeById() {

    }

    public void updateEmployee() {

    }

    public void deleteEmployee() {

    }

    public void getEmployeesByName() {

    }

    public void getEmployeesByDepartment() {

    }

    public void getEmployeesByEmail() {

    }
}
