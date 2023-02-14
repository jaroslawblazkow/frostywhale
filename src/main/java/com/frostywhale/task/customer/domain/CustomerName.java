package com.frostywhale.task.customer.domain;

public class CustomerName {
    private final String firstName;
    private final String lastName;

    private CustomerName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static CustomerName of(String firstName, String lastName) {
        return new CustomerName(firstName, lastName);
    }
}
