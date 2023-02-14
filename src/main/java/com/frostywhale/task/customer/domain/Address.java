package com.frostywhale.task.customer.domain;

public class Address {
    private final String city;
    private final ZipCode zipCode;
    private final String houseNumber;
    private final String buildingNumber;

    private Address(String city, ZipCode zipCode, String houseNumber, String buildingNumber) {
        this.city = city;
        this.zipCode = zipCode;
        this.houseNumber = houseNumber;
        this.buildingNumber = buildingNumber;
    }
}
