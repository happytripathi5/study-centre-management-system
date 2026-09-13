package com.studycentre.Study_Centre.repository;

import com.studycentre.Study_Centre.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}

