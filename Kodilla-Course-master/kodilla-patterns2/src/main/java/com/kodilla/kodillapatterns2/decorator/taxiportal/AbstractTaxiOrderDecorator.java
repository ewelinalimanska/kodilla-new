package com.kodilla.kodillapatterns2.decorator.taxiportal;

import java.math.BigDecimal;

public abstract class AbstractTaxiOrderDecorator implements TaxiOrder {

    private final TaxiOrder taxiOrder; //zapamiętywanie dekorowanego obiektu


    protected AbstractTaxiOrderDecorator(TaxiOrder taxiOrder) {//wstrzykiwanie dekorowanego obiektu
        this.taxiOrder = taxiOrder;
    }

    //opakowanie metod delegata swoimi metodami
    @Override
    public BigDecimal getCost() {
        return taxiOrder.getCost();
    }

    @Override
    public String getDescription() {
        return taxiOrder.getDescription();
    }
}
