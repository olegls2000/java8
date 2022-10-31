package com.lesson;

import com.shape.WithPerimeter;

public class Square2d implements WithPerimeter {
    private Point2d a;
    private Point2d b;
    private Point2d c;
    private Point2d d;

    public Square2d(Point2d a, Point2d b, Point2d c, Point2d d) {
        squarePointsCheck(a, b, c, d);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    private void squarePointsCheck(Point2d a, Point2d b, Point2d c, Point2d d){
        double ab = getDistanceBetweenPoints(a, b);
        double bc = getDistanceBetweenPoints(b, c);
        double cd = getDistanceBetweenPoints(c, d);
        double da = getDistanceBetweenPoints(d, a);

        double ac = getDistanceBetweenPoints(a, c);
        double bd = getDistanceBetweenPoints(b, d);

        if (ab != bc || bc != cd  || cd != da || da != ab) {
            throw new RuntimeException("Square has different ");

        }

        if (ac != bd) {

        }
    }
    public double calculatePerimeter(){
        double ab = getDistanceBetweenPoints(a, b);
        double bc = getDistanceBetweenPoints(b, c);
        double cd = getDistanceBetweenPoints(c, d);
        double da = getDistanceBetweenPoints(d, a);
        return ab + bc + cd + da;

    }
    public void printPerimeter(){
        System.out.print(calculatePerimeter());

    }

    private double getDistanceBetweenPoints (Point2d a, Point2d b) {
        double x_ab  = b.getX() - a.getX();
        double y_ab = b.getY() - a.getY();
        return Math.sqrt(x_ab * x_ab + y_ab *  y_ab);
    }

}
