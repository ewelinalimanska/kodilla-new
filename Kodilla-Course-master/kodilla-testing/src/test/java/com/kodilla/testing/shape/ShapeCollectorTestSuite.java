package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Square;


public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {

        Square square = new Square(4);
        Circle circle = new Circle(5);

        //Given
        ShapeCollector shapeCollection = new ShapeCollector(square);

        //When
        shapeCollection.addFigure(square);
        shapeCollection.addFigure(circle);

        //Then
        Assert.assertEquals(2, shapeCollection.size());
    }

    @Test
    public void testRemoveFigure(){

        Square square = new Square(9);
        Triangle triangle = new Triangle(4,5);
        Circle circle = new Circle(6);
        //Given
        ShapeCollector shapeCollection = new ShapeCollector(square);
        shapeCollection.addFigure(square);
        shapeCollection.addFigure(triangle);
        shapeCollection.addFigure(circle);

        //When
        shapeCollection.removeFigure(square);

        //Then
        Assert.assertEquals(2, shapeCollection.size());
    }
    @Test
    public void testGetFigure(){

        //Given
        Square square = new Square(8);
        ShapeCollector shapeCollector = new ShapeCollector(square);
        shapeCollector.addFigure(square);

        //When
        Shape figure = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(square, figure);

    }
}
