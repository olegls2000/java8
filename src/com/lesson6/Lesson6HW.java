package com.lesson6;

import com.shape.Circle;
import com.shape.Square;
import com.util.ShapeUtils;
import com.util.Utils;

public class Lesson6HW {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(33);
        //circle1.radius = 8;
        circle1.setRadius(8);
        int radius = circle2.getRadius();

        System.out.println("circle1 area is: " + circle1.calculateArea());
        System.out.println("circle1 perimeter is: " + circle1.calculatePerimeter());
        System.out.println("circle2 area is: " + circle2.calculateArea());
        System.out.println("circle2 perimeter is: " + circle2.calculatePerimeter());

        Square square222 = new Square();
        //square222.side = 66;
        System.out.println(square222.calculateArea());
        Square square333 = new Square(66);
        System.out.println(square333.calculateArea());
        square222.calculatePerimeter();

        //com.shape.Square.calculatePerimeter();
        int r = Utils.getRandomNumberFromInterval(5, 55);

        Circle[] arrayOfCircles = ShapeUtils.getArrayOfCircles(100);
        Square[] arrayOfSquares = ShapeUtils.getArrayOfSquares(200);


    }


}
