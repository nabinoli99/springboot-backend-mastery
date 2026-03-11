package com.learn.services;

import com.learn.dto.request.StudentRegistrationRequestDTO;
import com.learn.dto.response.StudentResponseDTO;
import com.learn.dto.response.StudentSummaryDTO;

import java.util.List;

public interface StudentService {

    StudentResponseDTO registerStudent(StudentRegistrationRequestDTO dto);
    StudentResponseDTO getStudentById(Long id);
    List<StudentSummaryDTO> getAllStudents();
}
