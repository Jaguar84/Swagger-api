package com.orient.swaggerapi.controller;

import com.orient.swaggerapi.entity.School;
import com.orient.swaggerapi.entity.Student;
import com.orient.swaggerapi.repository.StudentRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepostory studentRepostory;

    @GetMapping("/student/schools")
    public List<Student> getStudent(){
        return studentRepostory.findAll();
    }

    @GetMapping(value = "/school/students/{id}")
    public Student getSudentById(@PathVariable Long id){

        Student data = studentRepostory.findById(id).get();

        return data;
    }

    @GetMapping("/school")
    public School getSchool(){
        List<Student> students =studentRepostory.findAll();

        School sc=new School();

        sc.setName("Naxcivan Dovlet Universiteti");
        sc.setStudents(students);

        return sc;

    }
}
