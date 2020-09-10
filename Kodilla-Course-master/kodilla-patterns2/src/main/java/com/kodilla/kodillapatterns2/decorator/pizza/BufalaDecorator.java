package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class BufalaDecorator extends AbstractPizzaOrderDecorator {

    public BufalaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + mozzarella di bufala";
    }
}
