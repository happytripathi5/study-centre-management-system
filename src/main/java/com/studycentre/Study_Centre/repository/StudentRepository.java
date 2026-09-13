package com.studycentre.Study_Centre.repository;

import com.studycentre.Study_Centre.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
