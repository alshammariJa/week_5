package com.example.dto.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @NonNull
    @Column(columnDefinition = "varchar(30) not null")
    private  String name;
@ManyToOne
@JsonIgnore
@JoinColumn(name = "teacher_id" ,referencedColumnName = "id")
    private Teacher teacher;

@ManyToMany
private Set<Student>  student;

}
