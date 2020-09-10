package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderCost(){

        //given
        PizzaOrder pizza = new BasicPizzaOrder();
        System.out.println("Cost: " + pizza.getCost());

        //when
        BigDecimal cost = pizza.getCost();

        //then

        assertEquals(new BigDecimal(20), cost);
    }

    @Test
    public void testBasicPizzaOrderDescription(){

        //given
        PizzaOrder pizza = new BasicPizzaOrder();
        System.out.println(pizza.getDescription());

        //when
        String description = pizza.getDescription();

        //then
        assertEquals("Pizza with mozzarella and tomato sauce", description);
    }

    @Test
    public void testExtraCheesePizzaOrderCost(){

        //given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new ExtraCheeseDecorator(pizza);
        System.out.println("Cost: " + pizza.getCost());

        //when
        BigDecimal cost = pizza.getCost();

        //then

        assertEquals(new BigDecimal(25), cost);
    }

    @Test
    public void testExtraCheesePizzaOrderDescription(){

        //given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new ExtraCheeseDecorator(pizza);
        System.out.println(pizza.getDescription());

        //when
        String description = pizza.getDescription();

        //then
        assertEquals("Pizza with mozzarella and tomato sauce + extra cheese", description);
    }

    @Test
    public void testHamPizzaOrderCost(){

        //given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new HamDecorator(pizza);
        System.out.println("Cost: " + pizza.getCost());

        //when
        BigDecimal cost = pizza.getCost();

        //then

        assertEquals(new BigDecimal(27), cost);
    }

    @Test
    public void testHamPizzaOrderDescription(){

        //given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new HamDecorator(pizza);
        System.out.println(pizza.getDescription());

        //when
        String description = pizza.getDescription();

        //then
        assertEquals("Pizza with mozzarella and tomato sauce + prosciutto", description);
    }

    @Test
    public void testMushroomAndRucolaPizzaOrderCost(){

        //given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new MushroomDecorator(pizza);
        pizza = new RucolaDecorator(pizza);
        System.out.println("Cost: " + pizza.getCost());

        //when
        BigDecimal cost = pizza.getCost();

        //then

        assertEquals(new BigDecimal(30), cost);
    }

    @Test
    public void testMushroomAndRucolaPizzaOrderDescription(){

        //given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new MushroomDecorator(pizza);
        pizza = new RucolaDecorator(pizza);
        System.out.println(pizza.getDescription());

        //when
        String description = pizza.getDescription();

        //then
        assertEquals("Pizza with mozzarella and tomato sauce + mushrooms + rucola", description);
    }

    @Test
    public void testTheBestPizzaOrderCost(){

        //given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new HamDecorator(pizza);
        pizza = new RucolaDecorator(pizza);
        pizza = new BufalaDecorator(pizza);
        System.out.println("Cost: " + pizza.getCost());

        //when
        BigDecimal cost = pizza.getCost();

        //then

        assertEquals(new BigDecimal(30), cost);
    }

    @Test
    public void testTheBestPizzaOrderDescription(){

        //given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new HamDecorator(pizza);
        pizza = new RucolaDecorator(pizza);
        pizza = new BufalaDecorator(pizza);
        System.out.println(pizza.getDescription());

        //when
        String description = pizza.getDescription();

        //then
        assertEquals("Pizza with mozzarella and tomato sauce + prosciutto + rucola + mozzarella di bufala", description);
    }


}
