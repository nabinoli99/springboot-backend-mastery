package com.learn.dto.response;

import lombok.Data;

@Data
public class StudentSummaryDTO {

    private Long id;
    private String fullName;
    private String email;
    private boolean active;
}
