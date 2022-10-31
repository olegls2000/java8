package com.shape;

import com.lesson.Point2d;

public class Utils2d {
    private double getDistanceBetweenPoints (Point2d a, Point2d b) {
        double x_ab  = b.getX() - a.getX();
        double y_ab = b.getY() - a.getY();
        return Math.sqrt(x_ab * x_ab + y_ab *  y_ab);
    }
}
