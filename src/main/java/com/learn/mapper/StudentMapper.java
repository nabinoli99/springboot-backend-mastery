package com.learn.mapper;

import com.learn.dto.request.StudentRegistrationRequestDTO;
import com.learn.dto.response.StudentResponseDTO;
import com.learn.dto.response.StudentSummaryDTO;
import com.learn.entity.Student;

public class StudentMapper {

    // Entity → ResponseDTO (for profile/detail view)
    public static StudentResponseDTO toResponseDTO (Student student)
    {
        StudentResponseDTO dto = new StudentResponseDTO();

        String fullName = student.getFirstname() + " " + student.getLastname();

        dto.setId(student.getId());
        dto.setFullName(fullName);
        dto.setEmail(student.getEmail());
        dto.setGpa(student.getGpa());
        dto.setActive(student.isActive());
        dto.setCreatedAt(student.getCreatedAt());

        return dto;
    }

    // RequestDTO → Entity (for saving to database)
    public static Student toEntity(StudentRegistrationRequestDTO dto)
    {
        Student student = new Student();

        student.setFirstname(dto.getFirstName());
        student.setLastname(dto.getLastName());
        student.setEmail(dto.getEmail());
        student.setPassword(dto.getPassword()); //encoded in database
        student.setDateofBirth(dto.getDateofBirth());
        student.setGpa(dto.getGpa());
        student.setActive(true);  //server will decide it

        return student;
    }
    // Entity → SummaryDTO (for list/table view)
    public static StudentSummaryDTO toSummaryDTO(Student student)
    {
        StudentSummaryDTO dto = new StudentSummaryDTO();

        dto.setId(student.getId());
        dto.setFullName(student.getFirstname() + " " + student.getLastname());
        dto.setEmail(student.getEmail());
        dto.setActive(student.isActive());

        return dto;
    }
}
