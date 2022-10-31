package com.util;

import com.shape.Circle;
import com.shape.Square;

public class ShapeUtils {
    public static Circle[] getArrayOfCircles (int length) {
        Circle[] results = new Circle[length];
        for (int i = 0; i < results.length; i++){
            results[i] = new Circle();
        }
        return results;
    }

    public static Square[] getArrayOfSquare (int length) {
        Square[] results = new Square[length];
        for (int i = 0; i < results.length; i++){
            results[i] = new Square();
        }
        return results;
    }
}
