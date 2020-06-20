package com.kodilla.good.patterns.challenges.shop;

public class OrderDto {

    private User user;
    private boolean done;

    public OrderDto(User user, boolean done) {
        this.user = user;
        this.done = done;
    }
}
