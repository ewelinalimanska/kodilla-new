package com.kodilla.good.patterns.challenges.shop;

public class App {

    public static void main(String[] args) {

        User user = new User("Jan Kowalski", "janek@poczta.pl", 123234345, "ul. 3 Maja 33");
        Product product = new Product("Radio", 2300, true);
        InformationService informationService = new SMSService();
        OrderService orderService = new OrderService();
        OrderRepository orderRepository = new OrderCreator();
        ProductOrderService productOrderService = new ProductOrderService
                (informationService,orderService, orderRepository);
        OrderRequest orderRequest = new OrderRequest(user, product);

        productOrderService.process(orderRequest);
    }
}
