package com.kodilla.good.patterns.challenges.shop;

public class OrderCreator implements OrderRepository{
    @Override
    public void createOrder(User user, Product product) {
        System.out.println("Create order from: " + user + ", product: " + product);
    }
}
