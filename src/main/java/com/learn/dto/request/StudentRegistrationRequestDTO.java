package com.learn.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentRegistrationRequestDTO {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;


    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min = 6, max = 15)
    private String password;

    private LocalDate dateofBirth;

    private Double gpa;

}