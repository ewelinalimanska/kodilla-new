package com.kodilla.good.patterns.food;


public class Application {

    public static void main(String[] args) {

        ExtraFood extraFood = new ExtraFood();
        OrderRequest orderRequest = extraFood.addExtraFood();
        OrderService orderService = new OrderService();

        orderService.createOrder(orderRequest);

    }
}
