package com.example.dto.Controller;

import com.example.dto.Model.Student;
import com.example.dto.Model.Teacher;
import com.example.dto.Service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/student")
public class StudentController {

    private  final StudentService studentService;

    @GetMapping("/get")
    public ResponseEntity getStudent(){
        List<Student> students=studentService.getStudent();
        return ResponseEntity.status(200).body(students);
    }

    @PostMapping("/add")
    public ResponseEntity addStudent(@Valid @RequestBody Student student){
        studentService.addStudent(student);
        return ResponseEntity.status(200).body("Teacher added");
    }
    @PutMapping("/update/{id}")
    public ResponseEntity updateStudent(@PathVariable Integer id, @Valid @RequestBody Student student) {
        studentService.updateStudent(id, student);
        return ResponseEntity.status(200).body("Teacher updated");

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);

        return ResponseEntity.status(200).body("Teacher deleted");


    }

}
