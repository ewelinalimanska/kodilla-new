package com.kodilla.good.patterns.challenges.shop;

public class OrderService {

    public boolean order(final User user, final Product product) {
        System.out.println("Order to: " + user + ", product: " + product); //można użyć getterów
        return true;
    }
}
