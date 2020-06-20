package com.kodilla.good.patterns.food;

public class ExtraFood {

    public OrderRequest addExtraFood(){

        Contractor extrafood = new Contractor("ExtraFood");
        int productQuantity = 2;
        String product = "Orange";

        return new OrderRequest(extrafood, productQuantity, product);
    }
}
