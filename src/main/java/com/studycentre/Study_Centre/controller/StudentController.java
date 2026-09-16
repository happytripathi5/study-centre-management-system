package com.studycentre.Study_Centre.controller;

import com.studycentre.Study_Centre.entity.Student;
import com.studycentre.Study_Centre.service.StudentService;
import com.studycentre.Study_Centre.dto.CreateStudentDTO;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


   //get all students

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }



    //get student by id
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
    //update student by id
    @PutMapping("/{id}")
    public Student updateStudentById(@PathVariable Long id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }
    //delete student by id
    @DeleteMapping("/{id}")
    public boolean deleteStudentById(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }






}
