package com.example.studentpractise.repositories;

import com.example.studentpractise.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepositories extends JpaRepository<Student,Long> {

    List<Student> findStudentById (long kw);

}
