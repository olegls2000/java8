package com.lesson8;

import com.shape.Circle;
import com.shape.Triangle;
import com.shappe2d.Point2d;
import com.shappe2d.Triangle2d;

public class Lesson8 {
    public static void main(String[] args) {
        Circle circle = new Circle();

        //circle.privateMethod();

        //circle.packagePrivateMethod();

        //circle.protectedMethod();

        Triangle triangle = new Triangle(5,5,5);

        //triangle.a = 99;
        System.out.println("Continue ..");
        triangle.setA(6);
        triangle.setB(6);
        System.out.println("Continue ..");
        //triangle.checkCombination(89);

        Point2d a = new Point2d(0,1 );
        Point2d b = new Point2d(1,1 );
        //Point2d c = new Point2d(2,2 );
        Point2d c = null;
        Triangle2d triangle2d = new Triangle2d(null, b, c);
        triangle2d.setA(null);

    }
}
