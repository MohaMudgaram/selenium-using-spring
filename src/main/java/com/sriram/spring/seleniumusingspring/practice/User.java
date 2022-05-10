package com.sriram.spring.seleniumusingspring.practice;

import com.sriram.spring.seleniumusingspring.practice.Address;
import com.sriram.spring.seleniumusingspring.practice.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("${user.firstName:Gandhi}")
    private String firstName;
    @Value("${user.lastname:Mahatma}")
    private String lastName;
    private String userName;
    @Autowired
    private Salary salary;
    @Autowired
    private Address address;

//    public User(String firstName, String lastName, Salary salary, Address address) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.salary = salary;
//        this.address = address;
//        this.userName = String.format("%s %s", this.firstName, this.lastName);
//    }

//    public User(Salary salary, Address address) {
//        this.firstName = "Gandhi";
//        this.lastName = "Mahatma";
//        this.salary = salary;
//        this.address = address;
//        this.userName = String.format("%s %s", this.firstName, this.lastName);
//    }

//    public User() {
//        this.firstName = "Gandhi";
//        this.lastName = "Mahatma";
//        this.userName = String.format("%s %s", this.firstName, this.lastName);
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUserDetails() {
        this.userName = String.format("%s %s", this.firstName, this.lastName);
        return this.userName + "\n" + this.salary.getSalaryAmount() + "\n" + this.address.getAddress();
    }
}
