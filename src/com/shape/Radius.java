package com.shape;

import com.util.ShapeUtils;

public class Radius {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(33);

        System.out.print("Circle1 area is: " + circle1.calculateArea());

        Circle[] arrayOfCircles = ShapeUtils.getArrayOfCircles(100);

    }
}
