package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING = "DRIVINGTASK";
    public static final String PAINTING = "PAINTINGTASK";
    public static final String SHOPPING = "SHOPPINGTASK";

    public final Task makeTask (final String taskClass){
        switch (taskClass){
            case DRIVING:
                return new DrivingTask("Driving", "Tokio", "Audi");
            case PAINTING:
                return new PaintingTask("Painting", "white", "rabbit");
            case SHOPPING:
                return new ShoppingTask("Shopping", "milk", 7);
            default:
                return null;
        }
    }
}
