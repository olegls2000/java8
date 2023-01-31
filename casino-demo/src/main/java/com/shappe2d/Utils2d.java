package com.shappe2d;

public class Utils2d {

  public static final int DAY_OF_WEEKS = 7;

  private Utils2d() {
    throw new RuntimeException("Object invalid!");
  }

  static double getDistanceBetweenPoints(Point2d a, Point2d b) {
    double x_ab = b.getX() - a.getX();
    double y_ab = b.getY() - a.getY();
    return Math.sqrt(x_ab * x_ab + y_ab * y_ab);
  }
}
