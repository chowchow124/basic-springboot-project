package com.chase.boot_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Chase on 2024/11/15.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByEmail(String email);
}
