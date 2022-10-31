package com.shape;

public class TriangleSide {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(68);
        Triangle triangle3 = new Triangle(27);
        Triangle triangle4 = new Triangle(10);
        Triangle triangle5 = new Triangle(51);

        System.out.print("com.circle.Triangle 1 perimeter is: " + triangle1.calculatePerimeter());
        System.out.print("com.circle.Triangle 2 perimeter is: " + triangle2.calculatePerimeter());
        System.out.print("com.circle.Triangle 3 perimeter is: " + triangle3.calculatePerimeter());
        System.out.print("com.circle.Triangle 4 perimeter is: " + triangle4.calculatePerimeter());
        System.out.print("com.circle.Triangle 5 perimeter is: " + triangle5.calculatePerimeter());

    }
}
