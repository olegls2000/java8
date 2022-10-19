package com.shappe2d;

import com.shape.WithPerimeter;

import static com.shappe2d.Utils2d.getDistanceBetweenPoints;


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

    private void squarePointsCheck(Point2d a, Point2d b, Point2d c, Point2d d) {
        double ab = getDistanceBetweenPoints(this.a, this.b);
        double bc = getDistanceBetweenPoints(this.b, this.c);
        double cd = getDistanceBetweenPoints(this.c, this.d);
        double da = getDistanceBetweenPoints(this.d, this.a);
        double ac = getDistanceBetweenPoints(this.a, this.c);
        double bd = getDistanceBetweenPoints(this.b, this.d);
        if (ab != bc || bc != cd || cd != da || da != ab) {
            System.out.println("Square sides have to be equal.");
            throw new RuntimeException("Square sides have to be equal.");
        }
        if (ac != bd) {
            throw new RuntimeException("Diagonals length has to be EQUAL.");
        }
    }


    @Override
    public double calculatePerimeter() {
        double ab = getDistanceBetweenPoints(this.a, this.b);
        double bc = getDistanceBetweenPoints(this.b, this.c);
        double cd = getDistanceBetweenPoints(this.c, this.d);
        double da = getDistanceBetweenPoints(this.a, this.b);
        return ab + bc + cd + da;
    }

    @Override
    public void printPerimeter() {
        System.out.println("Squares perimeter is: " + calculatePerimeter());
    }

    private void checkNullPoint(Point2d point2d) {
        if (point2d == null) {
            System.out.println("2D Square is invalid. Points can not be NULL!");
            throw new RuntimeException("2D Square is invalid. Points can not be NULL!");
        }
    }
}

