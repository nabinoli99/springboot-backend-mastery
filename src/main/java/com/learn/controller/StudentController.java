package com.learn.controller;

import com.learn.dto.request.StudentRegistrationRequestDTO;
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
 Register user and
 provides 201 status */
    @PostMapping("/register")
    public ResponseEntity<StudentResponseDTO> register (
        @Valid @RequestBody StudentRegistrationRequestDTO dto) {
        return ResponseEntity.status(201)
                .body(studentService.registerStudent(dto));
    }

/**
* Get user by the user id */
    @GetMapping("/{id}")
    public ResponseEntity<StudentResponseDTO> getById( @PathVariable Long id ) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

/**
* Get all users detail */
    @GetMapping
    public ResponseEntity<List<StudentSummaryDTO>> getAll() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }
}
