package com.kodilla.testing.shape;

public class Circle implements Shape{

    private double radius;
    private final static double PI = 3.14;
    private double circleField;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return (this.getClass().getSimpleName());
    }

    @Override
    public double getField() {
        circleField = (PI * (radius * radius));
        return circleField;
    }

    @Override
    public String toString() {
        return (this.getClass().getSimpleName() + " with field of " + circleField);
    }
}
