package com.shape;

import com.util.Utils;

public class Square {
    public int side;
    public Square() {
        this.side = Utils.getRandomNumberFromInterval(20, 100);
    }
    public Square (int side) {
        this.side = side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
    public double calculateArea() {
        return side * side;
    }
}
