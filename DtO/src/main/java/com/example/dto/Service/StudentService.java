package com.example.dto.Service;

import com.example.dto.Exeption.Api;
import com.example.dto.Model.Student;
import com.example.dto.Repositry.StudentRepositry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepositry studentRepositry;

     public List<Student> getStudent(){
         return studentRepositry.findAll();
     }

     public void addStudent(Student student){
         studentRepositry.save(student);

     }

     public void  updateStudent(Integer id ,Student student){
         Student s= studentRepositry.findStudentById(id);
         if(s==null){
             throw  new Api("wrong id");
         }

         s.setName(s.getName());
         s.setAge(s.getAge());
         s.setMajor(s.getMajor());
         studentRepositry.save(s);

     }
    public  void deleteStudent(Integer id ){
        Student s= studentRepositry.findStudentById(id);
        if(s==null){
            throw  new Api("wrong id");
        }
        studentRepositry.deleteById(id);
    }

}
