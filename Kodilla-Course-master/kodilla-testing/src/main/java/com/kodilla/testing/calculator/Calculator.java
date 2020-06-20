package com.kodilla.testing.calculator;

public class Calculator {
    public int add(int a, int b){
        int result = a + b;
        System.out.println(a + "+" + b + "=" + result);
        return result;
    }

    public int substract(int a, int b) {
        int result = a - b;
        System.out.println(a + "-" + b + "=" + result);
        return result;
    }
}
