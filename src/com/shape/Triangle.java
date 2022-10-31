package com.shape;

import com.util.Utils;

public class Triangle {
    public int side;
    public Triangle() {
        this.side = Utils.getRandomNumberFromInterval(20, 100);
    }
    public Triangle (int side) {
        this.side = side;
    }

    public double calculatePerimeter() {
        return 3 * side;
    }
    public double calculateArea() {
        return side * side / 2;
    }
}
