package com.studycentre.Study_Centre.service;

import com.studycentre.Study_Centre.dto.CreateStudentDTO;
import com.studycentre.Study_Centre.entity.Student;
import com.studycentre.Study_Centre.entity.User;
import com.studycentre.Study_Centre.repository.StudentRepository;
import com.studycentre.Study_Centre.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;
    private UserRepository userRepository;
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    //BCryptPasswordEncoder: The data type. It is a specific class provided by Spring Security that safely turns plain text
    // passwords into secure, scrambled code (hashes) before saving them to a database.passwordEncoder: The custom name given to this variable so you can call it later
    // (e.g., passwordEncoder.encode(password)).new BCryptPasswordEncoder():
    // The Java command that directly instantiates (creates) the object right then and there in memory.


    public StudentService(StudentRepository studentRepository, UserRepository userRepository){
        this.studentRepository=studentRepository;
        this.userRepository=userRepository;
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

    public Student addStudent(CreateStudentDTO dto){
        User user= new User();
        user.setUsername(dto.getUsername());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setRole("STUDENT");
        user.setActive(true);

        userRepository.save(user);


        Student student= new Student();
        student.setUser(user);
        student.setName(dto.getName());
        student.setPhone(dto.getPhone());
        student.setMonthlyFee(dto.getMonthlyFee());
        student.setDueDate(dto.getDueDate());
        student.setJoiningDate(dto.getJoiningDate());
        student.setActive(true);

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
