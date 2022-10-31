package com.shape;

import com.util.ShapeUtils;

public class Side {
    public static void main(String[] args) {
        Square square1 = new Square();
        Square square2 = new Square(10);

        System.out.print("Square1 area is: " + square1.calculateArea());

        Square[] arrayOfSquare = ShapeUtils.getArrayOfSquare(100);

    }
}
