package com.kodilla.testing.shape;

public class Square implements Shape{

    private double squareSide;
    private double squareField;


    public Square(double squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public String getShapeName() {
        return (this.getClass().getSimpleName());
        }

    @Override
    public double getField() {
        squareField = squareSide * squareSide;
        return squareField;
    }

    @Override
    public String toString() {
        return ((this.getClass().getSimpleName()) + " with field of " + squareField);
    }
}
