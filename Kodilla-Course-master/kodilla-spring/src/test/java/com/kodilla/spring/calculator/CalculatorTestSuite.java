package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addVal = calculator.add(2, 1);
        double subVal = calculator.sub(2, 1);
        double mulVal = calculator.mul(2, 1);
        double divVal = calculator.div(2, 1);
        //Then
        Assert.assertEquals(3, addVal, 0);
        Assert.assertEquals(1, subVal, 0);
        Assert.assertEquals(2, mulVal, 0);
        Assert.assertEquals(2, divVal, 0);
    }
}
