package com.chase.boot_demo.converter;

import com.chase.boot_demo.dao.Student;
import com.chase.boot_demo.dto.StudentDTO;

/**
 * Created by Chase on 2024/11/16.
 */
public class StudentConverter {
    public static StudentDTO convertStudent(Student student){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setName(student.getName());
        studentDTO.setEmail(student.getEmail());
        return studentDTO;

    }

    public static Student convertStudent(StudentDTO studentDTO){
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setEmail(studentDTO.getEmail());
        return student;

    }
}
