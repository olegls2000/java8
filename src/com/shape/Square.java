package com.shape;


import static com.util.Utils.getRandomNumberFromInterval;

public class Square implements WithPerimeter, WithArea {
    public int side;

    public Square() {
        this.side = getRandomNumberFromInterval(20, 100);
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * this.side;
    }

    @Override
    public void printPerimeter() {
        System.out.println("Square Perimeter = " + calculatePerimeter());
    }

    @Override
    public double calculateArea() {
        return this.side * this.side / 2;
    }

    @Override
    public void printArea() {
        System.out.println("Square Area = " + calculateArea());
    }
}
