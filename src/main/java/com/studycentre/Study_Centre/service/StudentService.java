package com.studycentre.Study_Centre.service;

import com.studycentre.Study_Centre.entity.Student;
import com.studycentre.Study_Centre.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    //get all the students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();

    }


    //get one student


    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }


    //add one student

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }



    //update a student



    public Student updateStudent(Long id, Student student){
        Student existingStudent= studentRepository.findById(id).orElse(null);
        if(existingStudent==null){
            return null;
        }
        existingStudent.setName(student.getName());
        existingStudent.setPhone(student.getPhone());
        existingStudent.setMonthlyFee(student.getMonthlyFee());
        existingStudent.setDueDate(student.getDueDate());
        existingStudent.setJoiningDate(student.getJoiningDate());
        existingStudent.setActive(student.isActive());


        return studentRepository.save(existingStudent);

    }

    public boolean deleteStudent (Long id) {
        Student existingStudent= studentRepository.findById(id).orElse(null);
        if (existingStudent==null){
            return false;
        }
        studentRepository.delete(existingStudent);
        return true;

    }








                                                         }
