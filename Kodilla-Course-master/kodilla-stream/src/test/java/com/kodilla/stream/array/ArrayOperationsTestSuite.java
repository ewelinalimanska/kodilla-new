package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test

    public void testGetAverage(){

        //given
        int[] numbers = {44, 32, 12, 1, 90};

        //when
        double average = ArrayOperations.getAverage(numbers);
        //then

        Assert.assertEquals(35.8, average, 0.01);
        System.out.println("The average is: " + average);

    }



}
