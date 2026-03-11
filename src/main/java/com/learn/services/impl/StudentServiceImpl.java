package com.learn.services.impl;

import com.learn.dto.request.StudentRegistrationRequestDTO;
import com.learn.dto.response.StudentResponseDTO;
import com.learn.dto.response.StudentSummaryDTO;
import com.learn.entity.Student;
import com.learn.mapper.StudentMapper;
import com.learn.repository.StudentRepository;
import com.learn.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public StudentResponseDTO registerStudent(StudentRegistrationRequestDTO dto)
    {
        Student student = StudentMapper.toEntity(dto);
        student.setPassword(passwordEncoder.encode(dto.getPassword()));
        Student saved = studentRepository.save(student);
        return StudentMapper.toResponseDTO(saved);
    }

    @Override
    public StudentResponseDTO getStudentById(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Student Not Found"));
        return StudentMapper.toResponseDTO(student);
    }

    @Override
    public List<StudentSummaryDTO> getAllStudents() {
        return studentRepository.findAll()
                .stream()
                .map(StudentMapper::toSummaryDTO)
                .collect(Collectors.toList());
    }
}
