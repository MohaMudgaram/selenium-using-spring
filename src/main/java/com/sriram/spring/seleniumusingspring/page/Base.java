package com.sriram.spring.seleniumusingspring.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public abstract class Base {

    @Autowired
    protected WebDriver webDriver;

    @Autowired
    protected WebDriverWait webDriverWait;

    @Autowired
    protected Logger logger;

    @PostConstruct
    private void setUp() {
        PageFactory.initElements(this.webDriver, this);
    }

    @PreDestroy
    private void tearDown() {
        this.webDriver.quit();
    }

    public abstract boolean isDriverInitiatedAndLoaded();
}
