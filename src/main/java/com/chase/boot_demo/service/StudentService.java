package com.chase.boot_demo.service;

import com.chase.boot_demo.dao.Student;
import com.chase.boot_demo.dto.StudentDTO;

/**
 * Created by Chase on 2024/11/16.
 */
public interface StudentService {
    StudentDTO getStudentById(long id);

    Long addNewStudent(StudentDTO studentDTO);

    void deleteStudentById(long id);

    StudentDTO updateStudentById(long id, String name, String email);
}
