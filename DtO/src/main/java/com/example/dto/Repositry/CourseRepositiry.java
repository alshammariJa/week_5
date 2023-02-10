package com.example.dto.Repositry;

import com.example.dto.Model.Course;
import com.example.dto.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepositiry extends JpaRepository<Course, Integer> {
    Course findCourseById(Integer id);

}
