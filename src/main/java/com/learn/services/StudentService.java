package com.learn.services;

import com.learn.dto.request.StudentRegistrationRequestDTO;
import com.learn.dto.request.StudentUpdateRequestDTO;
import com.learn.dto.response.StudentResponseDTO;
import com.learn.dto.response.StudentSummaryDTO;

import java.util.List;

public interface StudentService {
    //Important CRUD Methods
    StudentResponseDTO registerStudent(StudentRegistrationRequestDTO dto);
    StudentResponseDTO getStudentById(Long id);
    List<StudentSummaryDTO> getAllStudents();
    StudentResponseDTO  updateStudent(Long id , StudentUpdateRequestDTO request);
    StudentResponseDTO  updateStudentgpa(Long id , StudentUpdateRequestDTO request);
    void deleteStudent(Long id);
}
