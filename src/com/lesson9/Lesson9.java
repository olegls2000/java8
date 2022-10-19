package com.lesson9;

import com.shappe2d.Point2d;
import com.shappe2d.Square2d;
import com.shappe2d.Utils2d;

public class Lesson9 {
    public static void main(String[] args) {

        Square2d square2d = new Square2d(
                new Point2d(1, 1),
                new Point2d(1, 4),
                new Point2d(4, 4),
                new Point2d(4, 1)
        );
        square2d.printPerimeter();


    }
}
