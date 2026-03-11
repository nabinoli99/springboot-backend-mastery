package com.learn.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StudentResponseDTO {

    private Long id;
    private String fullName;
    private String email;
    private Double gpa;
    private LocalDateTime createdAt;
    private boolean active;

}
