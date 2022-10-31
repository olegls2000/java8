package com.lesson;

public class Lesson9 {
    public static void main(String[] args) {
        Triangle2d triangle2d = new Triangle2d(null, null, null);
        triangle2d.printPerimeter();
        Square2d square2d = new Square2d(
                new Point2d(1, 1),
                new Point2d(1, 4),
                new Point2d(4, 4),
                new Point2d(4, 1)
        );
        square2d.printPerimeter();
    }
}
