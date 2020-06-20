package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> collection = new ArrayList<>();


    public ShapeCollector(Shape shape) {
    }

    public void addFigure(Shape shape) {
        collection.add(shape);
    }

    public void removeFigure(Shape shape) {
        collection.remove(shape);
    }

    public Shape getFigure(int n) {
        return collection.get(n);
    }

    public void showFigures(ArrayList <Shape> collection) {
        for (Shape shape : collection){
           System.out.println(shape);
        }
    }

    public int size() {
        return collection.size();
    }
}
