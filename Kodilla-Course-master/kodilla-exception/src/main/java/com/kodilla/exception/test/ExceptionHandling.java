package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main (String arg[]){

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2, 2);
        } catch (Exception e) {
            System.out.println("Error!");
        }
        finally {
            System.out.println("End of the test");
        }
    }
}
