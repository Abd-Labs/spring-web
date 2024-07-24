package com.abdullah.first_web_app.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name ="Employee")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private LocalDate dateOfJoining;
    private boolean isActive;
}
