package com.kodilla.good.patterns.food;

public class OrderRequest {

    private Contractor contractor;
    private int productQuantity;
    private String product;

    public OrderRequest(Contractor contractor, int productQuantity, String product) {
        this.contractor = contractor;
        this.productQuantity = productQuantity;
        this.product = product;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public String getProduct() {
        return product;
    }
}
