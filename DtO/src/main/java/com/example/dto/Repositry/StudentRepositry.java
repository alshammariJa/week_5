package com.example.dto.Repositry;

import com.example.dto.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositry extends JpaRepository<Student ,Integer> {
    Student findStudentById(Integer id);

}
