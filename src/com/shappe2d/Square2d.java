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
    double ab = getDistanceBetweenPoints(a, b);
    double bc = getDistanceBetweenPoints(b, c);
    double cd = getDistanceBetweenPoints(c, d);
    double da = getDistanceBetweenPoints(d, a);
    double ac = getDistanceBetweenPoints(a, c);
    double bd = getDistanceBetweenPoints(b, d);
    if (ab != bc || bc != cd || cd != da || da != ab) {
      throw new RuntimeException("Square has different sides");
    }
    if (ac != bd) {
      throw new RuntimeException("Square has different diagonals");
    }
  }

  @Override
  public double calculatePerimeter() {
    double ab = getDistanceBetweenPoints(a, b);
    double bc = getDistanceBetweenPoints(b, c);
    double cd = getDistanceBetweenPoints(c, d);
    double da = getDistanceBetweenPoints(d, a);
    return ab + bc + cd + da;
  }

  @Override
  public void printPerimeter() {
    System.out.println("Square perimeter is: "  + calculatePerimeter());
  }

}
