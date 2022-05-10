package com.sriram.spring.seleniumusingspring.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("${user.address.houseNumber:123}")
    private int houseNumber;
    @Value("${user.address.streetName:Gandhi Street}")
    private String streetName;
    @Value("${user.address.cityName:Tirupati}")
    private String cityName;
    @Value("${user.address.zipCode:517507}")
    private int zipCode;

//    public Address(int houseNumber, String streetName, String cityName, int zipCode) {
//        this.houseNumber = houseNumber;
//        this.streetName = streetName;
//        this.cityName = cityName;
//        this.zipCode = zipCode;
//    }

//    public Address() {
//        this.houseNumber = 123;
//        this.streetName = "GANDHI STREET";
//        this.cityName = "TIRUPATI";
//        this.zipCode = 517507;
//    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return this.houseNumber + "\n" + this.streetName + "\n" + this.cityName + "\n" + this.zipCode;
    }
}
