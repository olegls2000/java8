package com.shappe2d;

public class Circle2d {
    private Point2d center;
    private int radius;

    public Circle2d(Point2d center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point2d getCenter() {
        return center;
    }

    public void setCenter(Point2d center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
