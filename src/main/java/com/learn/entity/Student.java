package com.learn.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
