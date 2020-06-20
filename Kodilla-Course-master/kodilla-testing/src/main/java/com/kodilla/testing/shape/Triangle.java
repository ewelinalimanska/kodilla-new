package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private double high;
    private double base;
    private double triangleField;

    public Triangle(double high, double base) {
        this.high = high;
        this.base = base;
    }

    @Override
    public String getShapeName() {
            return (this.getClass().getSimpleName());
        }

    @Override
    public double getField() {
        triangleField = ( high * base) /2;
        return triangleField;
    }

    @Override
    public String toString() {
        return ((this.getClass().getSimpleName()) + " with field of " + triangleField);
    }
}
