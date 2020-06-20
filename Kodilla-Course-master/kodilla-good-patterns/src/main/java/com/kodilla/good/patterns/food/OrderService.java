package com.kodilla.good.patterns.food;

public class OrderService {

    public void createOrder(OrderRequest orderRequest){
        if (orderRequest.getContractor().process()) {
            System.out.println("Order from " + orderRequest.getContractor() +
                    ", product and quantity:" + orderRequest.getProduct() + ", " + orderRequest.getProductQuantity());
        } else {
            System.out.println("Error! Unrealised order");
        }
    }
}
