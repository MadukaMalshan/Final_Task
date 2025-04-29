package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Employee;
import org.example.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/supplier/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/save")
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }

    @GetMapping("/get-all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/get-by-id/{id}")
    public void getEmployeeById(@PathVariable Long id) {
        employeeService.getEmployeeById(id);
    }

    @PutMapping("/update")
    public void updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);

    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/get-by-name/{name}")
    public void getEmployeesByName(@PathVariable String name) {
        employeeService.getEmployeesByName(name);
    }

    @DeleteMapping("/get-by-department/{department}")
    public void getEmployeesByDepartment(@PathVariable String department) {
        employeeService.getEmployeesByDepartment(department);

    }

    public void getEmployeesByEmail(@PathVariable String email) {
        employeeService.getEmployeesByEmail(email);

    }
}
