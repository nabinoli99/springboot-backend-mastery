package com.learn.dto.request;

import lombok.Data;
import java.time.LocalDate;


@Data
public class StudentUpdateRequestDTO {
    private String firstName;
    private String lastName;
    private LocalDate dateofBirth;
    private String email;
    private Double gpa;
}
