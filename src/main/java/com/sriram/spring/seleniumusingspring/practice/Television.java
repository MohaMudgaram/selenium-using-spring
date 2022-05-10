package com.sriram.spring.seleniumusingspring.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Television {

    @Value("${tv.name:Sony}")
    private String name;

    public Television() {
        System.out.println("Inside the Constructor: TV Name: " + this.name);
    }

    @PostConstruct
    public void switchOn() {
        System.out.println("Inside the Post Construct: TV Name: " + this.name);
        System.out.println("TV is switched on.");
    }

    public void playMovie() {
        for (int i=1; i<=6; i++) {
            System.out.println("Playing movie scene " + i);
        }
    }

    @PreDestroy
    public void switchOff() {
        System.out.println("TV is switched off.");
    }
}
