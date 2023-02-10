package com.example.dto.Controller;

import com.example.dto.Model.Course;
import com.example.dto.Service.CourseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/coures")
public class CouresController {

    private final CourseService courseServive;

    @GetMapping("/get")
    public ResponseEntity getCoures(){
        List<Course> course=courseServive.getCourses();
        return ResponseEntity.status(200).body(course);
    }
    @PostMapping("/add")
    public ResponseEntity addCoures(@Valid @RequestBody Course course){
        courseServive.addCourses(course);
        return ResponseEntity.status(200).body("course added");
    }
    @PutMapping("/update/{id}")
    public ResponseEntity updateCoures(@PathVariable Integer id, @Valid @RequestBody Course course) {
        courseServive.updateCourses(id, course);
        return ResponseEntity.status(200).body("course updated");

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteTeacher(@PathVariable Integer id){
        courseServive.deleteCourses(id);

        return ResponseEntity.status(200).body("course deleted");


    }
//    @GetMapping("/name")
//    public ResponseEntity getNameTeacher(){
//courseServive.findTeacherNameByIdCourses(@PathVariable Integer id,);
//        return ResponseEntity.status(200).body(course);
//    }
    }
