package com.sriram.spring.seleniumusingspring.practice;

import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {
    @Value("${user.salary:6000}")
    private int salaryAmount;

//    public Salary(int salaryAmount) {
//        this.salaryAmount = salaryAmount;
//    }

//    public Salary() {
//        this.salaryAmount = 24000;
//    }

    public int getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
}
