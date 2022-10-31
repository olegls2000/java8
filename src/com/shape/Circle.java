package com.shape;

import com.util.Utils;

public class Circle {
    public int radius;
    public Circle() {
        this.radius = Utils.getRandomNumberFromInterval(20, 100);
    }
    public Circle (int radius) {
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI + this.radius;
    }
    public double calculateArea() {
        return Math.PI + this.radius * this.radius;
    }
}

