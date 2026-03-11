package com.learn.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "students")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column(unique = true)
    @NotNull
    private String email;

    @Column
    private String password;

    @Column
    private LocalDate dateofBirth;

    @Column
    private Double gpa;

    @Column
    private boolean active;

    @Column
    @CreationTimestamp
    private LocalDateTime createdAt;
}
