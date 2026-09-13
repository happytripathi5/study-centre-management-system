package com.studycentre.Study_Centre.service;

import com.studycentre.Study_Centre.entity.Payment;
import com.studycentre.Study_Centre.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    private PaymentRepository paymentRepository;

 public PaymentService(PaymentRepository paymentRepository){
     this.paymentRepository=paymentRepository;
 }

    //1.Get all the payments

    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }

    //2.GetPaymentbyid
    public Payment getPaymentById(Long id){

        return paymentRepository.findById(id).orElse(null);

    }

    //3.addPayment

    public Payment addPayment(Payment payment) {

        return paymentRepository.save(payment);

    }

    //4.deletePayment
    public boolean deletePayment(Long id) {

        Payment existingPayment = paymentRepository.findById(id).orElse(null);

        if (existingPayment == null) {
            return false;
        }

        paymentRepository.delete(existingPayment);
        return true;

    }


}
