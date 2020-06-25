package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBicmac4Ingredients(){

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .burgers(1)
                .sauce("ketchup")
                .ingredient("cheese")
                .ingredient("mushrooms")
                .ingredient("lettuce")
                .ingredient("pickles")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }

    @Test
    public void testNewBigmac3burgers(){

        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("without sesame")
                .sauce("mustard")
                .burgers(3)
                .ingredient("lettuce")
                .ingredient("cheese")
                .ingredient("bacon")
                .build();
        System.out.println(bigmac);
        //when
        int howManyBurgers = bigmac.getBurgers();
        //then
        Assert.assertEquals(3, howManyBurgers);
    }

    @Test
    public void testNewBigmacWithMayo(){
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("without sesame")
                .sauce("mayo")
                .burgers(3)
                .ingredient("lettuce")
                .ingredient("cheese")
                .ingredient("bacon")
                .ingredient("egg")
                .build();
        System.out.println(bigmac);
        //when
        String whatKindOfSauce = bigmac.getSauce();
        //then
        Assert.assertEquals("mayo", whatKindOfSauce);
    }
}
