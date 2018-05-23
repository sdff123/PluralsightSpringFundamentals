package com.pluralsight.model;

public class Customer {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public Customer() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
