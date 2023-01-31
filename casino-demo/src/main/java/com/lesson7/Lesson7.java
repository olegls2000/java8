package com.lesson7;

import com.shape.Circle;
import com.shape.WithPerimeter;
import com.util.ShapeUtils;

public class Lesson7 {
    public static void main(String[] args) {
        WithPerimeter[] arrayOfCircles = ShapeUtils.getArrayOfCircles(3);
        WithPerimeter[] arrayOfSquares = ShapeUtils.getArrayOfSquares(4);

        int circleArrayLength = arrayOfCircles.length;
        int squareArrayLength = arrayOfSquares.length;
        int totalLength = circleArrayLength + squareArrayLength;

        WithPerimeter[] shapes = new WithPerimeter[totalLength];
        for (int i = 0; i < arrayOfCircles.length; i++) {
            shapes[i] = arrayOfCircles[i];
        }
        for (int i = 0; i < arrayOfSquares.length; i++) {
            shapes[i + circleArrayLength] = arrayOfSquares[i];
        }

        Circle circleX = new Circle();
        circleX.calculatePerimeter();
        circleX.calculateArea();

        WithPerimeter circleP = new Circle();
        circleP.calculatePerimeter();
        circleP.printPerimeter();
        //circleP.calculateArea();

        WithPerimeter maxPerim = shapes[0];
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].calculatePerimeter() > maxPerim.calculatePerimeter()) {
                maxPerim = shapes[i];
            }
        }
        maxPerim.printPerimeter();


    }

}
