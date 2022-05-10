package com.sriram.spring.seleniumusingspring.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebDriverConfig {

    @Value("${webDriver.wait:30}")
    private long timeOutInSeconds;

    @Bean
    public WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().browserVersion("101").setup();
        return new ChromeDriver();
    }

    @Bean
    public WebDriverWait getWebDriverWait(WebDriver webDriver) {
        return new WebDriverWait(webDriver, timeOutInSeconds);
    }

    @Bean
    public Logger getLogger() {
        return LoggerFactory.getLogger("Base Logger");
    }
}
