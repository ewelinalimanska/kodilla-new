package com.kodilla.good.patterns.challenges.shop;

public class User {

    private String name;
    private String email;
    private int phoneNumber;
    private String shippingAddress;

    public User(String name, String email, int phoneNumber, String shippingAddress) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.shippingAddress = shippingAddress;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    @Override
    public String toString() {
        return  name + ", " + email;
    }
}
