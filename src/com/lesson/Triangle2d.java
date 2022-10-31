package com.lesson;

import com.shape.WithPerimeter;

public class Triangle2d implements WithPerimeter {
    private Point2d a;
    private Point2d b;
    private Point2d c;

    public Triangle2d(Point2d a, Point2d b, Point2d c) {
        checkNullPoint(a);
        checkNullPoint(b);
        checkNullPoint(c);
        checkThreePointsOnLine(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(Point2d a) {
        checkNullPoint(a);
        checkThreePointsOnLine(a, this.b, this.c);
        this.a = a;
    }

    public void setB(Point2d b) {
        checkNullPoint(b);
        checkThreePointsOnLine(this.a, b, this.c);
        this.b = b;
    }

    public void setC(Point2d c) {
        checkNullPoint(c);
        checkThreePointsOnLine(this.a, this.b, c);
        this.c = c;
    }

    private void checkThreePointsOnLine(Point2d a, Point2d b, Point2d c) {
        if ((c.getY() - a.getY()) / (b.getY() - a.getY()) == (c.getX() - a.getX()) / (b.getX() - a.getX())) {
            System.out.println("2D Triangle is invalid. Points located on the line!");
            throw new RuntimeException("2D Triangle is invalid. Points located on the line!");
        }
    }

    private void checkNullPoint(Point2d point2d){
        if(point2d == null) {
            System.out.println("2D Triangle is invalid. Points can not be NULL!");
            throw new RuntimeException("2D Triangle is invalid. Points can not be NULL!");
        }
    }


    public double calculatePerimeter() {
        double x_ab = b.getX()-a.getX();
        double y_ab = b.getY()-a.getY();
        double ab = Math.sqrt(x_ab*x_ab + y_ab * y_ab);

        double ac = 0;
        double bc = 0;
        return ab + bc + ac;
    }

    private double getDistanceBetweenPoints(Point2d a, Point2d b) {
        double x_ab = b.getX() - a.getX();
        double y_ab = b.getX() - a.getY();
        return Math.sqrt(x_ab + x_ab + y_ab + y_ab);
    }


    public void printPerimeter() {
        //TODO ..

    }
}

