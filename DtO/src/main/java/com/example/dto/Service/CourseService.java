package com.example.dto.Service;

import com.example.dto.Exeption.Api;
import com.example.dto.Model.Course;
import com.example.dto.Model.Teacher;
import com.example.dto.Repositry.CourseRepositiry;
import com.example.dto.Repositry.TeacherRepositry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CourseService {
    private final CourseRepositiry courseRepositiry;
    private  final TeacherRepositry teacherRepositry;


    public List<Course> getCourses(){
      return courseRepositiry.findAll();
    }
    public void addCourses(Course course){
         courseRepositiry.save(course);
    }
    public void updateCourses( Integer id,Course course){
        Course c= courseRepositiry.findCourseById(id);
         if(c==null) {
             throw new Api("some one err");
         }
         c.setName(c.getName());
         courseRepositiry.save(c);

         }

         public void deleteCourses(Integer id){
             Course c= courseRepositiry.findCourseById(id);
             if(c==null) {
                 throw new Api("some one err");
             }
          courseRepositiry.deleteById(id);
         }



//     public Teacher findTeacherNameByIdCourses(){
//         Course  c=courseRepositiry.findCourseById(courses_id);
//
//         if(c==null) {
//             throw new Api("some one err");
//         }
//
//     }



}
