package com.studycentre.Study_Centre.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CreateStudentDTO {
    private String name;
    private String phone;
    private String username;
    private String password;
    private BigDecimal monthlyFee;
    private LocalDate dueDate;
    private LocalDate joiningDate;

    public void setName(String name){
        this.name= name;

    }
    public String getName(){
        return this.name;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getPhone(){
        return this.phone;

    }

    public void setUsername(String username){
        this.username=username;


    }
    public String getUsername(){
        return this.username;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setMonthlyFee(BigDecimal monthlyFee){
        this.monthlyFee=monthlyFee;
    }

    public BigDecimal getMonthlyFee(){
        return this.monthlyFee;
    }

    public void setDueDate(LocalDate dueDate){
        this.dueDate=dueDate;
    }

    public LocalDate getDueDate(){
        return this.dueDate;
    }

    public void setJoiningDate(LocalDate joiningDate){
        this.joiningDate=joiningDate;
    }

    public LocalDate getJoiningDate(){
        return this.joiningDate;
    }


}
