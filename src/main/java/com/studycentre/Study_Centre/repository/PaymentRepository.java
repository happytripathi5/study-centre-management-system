package com.studycentre.Study_Centre.repository;

import com.studycentre.Study_Centre.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
