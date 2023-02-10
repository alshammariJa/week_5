package com.example.dto.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @NonNull
    private String name;
    @NonNull
    private Integer age;
    @NonNull
    private  String major;

    @ManyToMany
    @JsonIgnore
    private Set<Course>  course;
}
