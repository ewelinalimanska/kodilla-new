package com.kodilla.good.patterns.challenges.shop;

public class Product {

    private String name;
    private double price;
    private boolean availability;

    public Product(String name, int price, boolean availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return  name;
    }
}
