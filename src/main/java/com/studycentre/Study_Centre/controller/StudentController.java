package com.studycentre.Study_Centre.controller;

import com.studycentre.Study_Centre.entity.Student;
import com.studycentre.Study_Centre.service.StudentService;
import com.studycentre.Study_Centre.dto.CreateStudentDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    StudentService studentService;


    public StudentController(StudentService studentService){
        this.studentService=studentService;

    }
   @PostMapping
    public Student addStudent(@RequestBody CreateStudentDTO  dto){
        return studentService.addStudent(dto);
   }


//    Public String--right now adding controller and serivce for adding



}
