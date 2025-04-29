package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Employee;
import org.example.entity.EmployeeEntity;
import org.example.repository.EmployeeRepository;
import org.example.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeImpl implements EmployeeService {
    private final ModelMapper modelMapper;
    private final EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        List<EmployeeEntity>employeeEntities =employeeRepository.findAll();
        employeeEntities.forEach(employeeEntity -> {
            employees.add(modelMapper.map(employeeEntity, Employee.class));
        });
        return employees;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return modelMapper.map(employeeRepository.findById(id), Employee.class);
    }

    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.save(modelMapper.map(employee, EmployeeEntity.class));
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(modelMapper.map(employee, EmployeeEntity.class));
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
