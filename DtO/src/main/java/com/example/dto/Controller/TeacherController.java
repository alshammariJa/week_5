package com.example.dto.Controller;

import com.example.dto.Model.Address;
import com.example.dto.Model.Teacher;
import com.example.dto.Service.AddressService;
import com.example.dto.Service.TeacherService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.dto.DTO.AddressDto;
import java.util.List;
@RestController
@RequiredArgsConstructor

@RequestMapping("/api/v1/teacher")
public class TeacherController {
    private final TeacherService teacherService;
    private final AddressService addressService;

    @GetMapping("/get")
    public ResponseEntity getTeacher(){
        List<Teacher> teachers=teacherService.getTeacher();
        return ResponseEntity.status(200).body(teachers);
    }

    @PostMapping("/add")
    public ResponseEntity addTeacher(@Valid @RequestBody Teacher teachers){
        teacherService.addTeacher(teachers);
        return ResponseEntity.status(200).body("Teacher added");
    }
    @PutMapping("/update/{id}")
    public ResponseEntity updateTeacher(@PathVariable Integer id, @Valid @RequestBody Teacher teachers) {
        teacherService.UpdateTeacher(id, teachers);
        return ResponseEntity.status(200).body("Teacher updated");

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteTeacher(@PathVariable Integer id){
        teacherService.deleteTeacher(id);

        return ResponseEntity.status(200).body("Teacher deleted");


    }




}
