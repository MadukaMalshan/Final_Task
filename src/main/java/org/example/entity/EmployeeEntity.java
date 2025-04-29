package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import utill.DepartmentTypes;

@Data
@Entity
@Table (name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @Enumerated(EnumType.STRING)
    private DepartmentTypes departmentTypes;
}
