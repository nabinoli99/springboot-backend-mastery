package com.learn.controller;

import com.learn.common.ApiResponse;
import com.learn.common.ApiResponseUtil;
import com.learn.dto.request.StudentRegistrationRequestDTO;
import com.learn.dto.request.StudentUpdateRequestDTO;
import com.learn.dto.response.StudentResponseDTO;
import com.learn.dto.response.StudentSummaryDTO;
import com.learn.services.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    public final StudentService studentService;

/**
 Register student and
 provides 201 status */
    @PostMapping("/register")
    public ResponseEntity<ApiResponse<StudentResponseDTO>> register (
        @Valid @RequestBody StudentRegistrationRequestDTO request) {
        StudentResponseDTO dto = studentService.registerStudent(request);
        return ResponseEntity.status(201)
                .body(ApiResponseUtil.success("Student registered successfully ",dto));
    }

/**
* Get student by the user id */
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<StudentResponseDTO>> getStudent(@PathVariable Long id ) {
        StudentResponseDTO dto = studentService.getStudentById(id);
        return ResponseEntity.ok(ApiResponseUtil.success("Student fetched successfully",dto));
    }

/**
* Get all students details */
    @GetMapping
    public ResponseEntity<ApiResponse<List<StudentSummaryDTO>>> getAllStudents() {
        List<StudentSummaryDTO> students = studentService.getAllStudents();
        return ResponseEntity.ok(ApiResponseUtil.success("Students fetched successfully",students));
    }

    /**
     * Update student's details with id */
    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<StudentResponseDTO>> updateStudent(
            @PathVariable Long id ,
            @RequestBody  StudentUpdateRequestDTO request) {
        StudentResponseDTO dto = studentService.updateStudent(id,request);
        return ResponseEntity.ok(ApiResponseUtil.success("Student's Details updated successfully",dto));
    }

    @PutMapping("/gpa/{id}")
    public ResponseEntity<ApiResponse<StudentResponseDTO>> updateStudentByGpa(
            @PathVariable Long id ,
            @RequestBody  StudentUpdateRequestDTO request) {
        StudentResponseDTO dto = studentService.updateStudentgpa(id,request);
        return ResponseEntity.ok(ApiResponseUtil.success("Student's gpa updated successfully",dto));
    }

    /**
     * Delete student's details with id */
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.ok(ApiResponseUtil.success("Student deleted successfully", null));
    }

}
