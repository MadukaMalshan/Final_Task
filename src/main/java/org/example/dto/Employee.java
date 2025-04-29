package org.example.dto;

import lombok.*;
import utill.DepartmentTypes;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String email;
    private DepartmentTypes departmentTypes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
