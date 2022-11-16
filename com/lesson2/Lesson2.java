package com.lesson2;

public class Lesson2 {
  public static void main(String[] args) {
    double result = calculation(3);
    printHello();
    double result8 = calculation(3);
    printHello();
    double result9 = calculation(3);
    double result10 = calculation(4);
    double result11 = calculation(5);
    int summa = summ(10, 11);
    System.out.println("Summa = " + summa);
    int summa1 = summ(100, 110);

    mult(100, 101, 102);
    mult(200, 201, 202);


    //Comparison operators:
    boolean compResult = 2 > 5;
    System.out.println("Comp result = " + compResult);
    boolean compResult1 = 2 >= 2;
    boolean compResult2 = 2 < 2;
    boolean compResult3 = 2 <= 2;
    boolean compResult4 = 2 == 2;
    boolean compResult5 = 2 != 2;

    int r = 4;
    int g = 5;
    compResult = (r++) + g > (r - g) * 1;
    System.out.println("Comp result = " + compResult);

    if (compResult) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }

    printMaxValue(33, 44);
    printMaxValue(55, 44);
    printMaxValue(55, 55);

    printMinValue(1.4d, 4.5d);
    printMinValue(1d, 4d);
    printMinValue(10, 10);

    /*com.lesson2.Lesson2 executor = new com.lesson2.Lesson2();
    executor.checkInterval(3, 5, 10);
    executor.checkInterval(5, 5, 10);
    executor.checkInterval(6, 0, 5);
    executor.checkInterval(10, 0, 100);
    executor.checkInterval(11, 20, 30);*/

    String formatted =
        String.format("Number %d is in interval (%d, %d). String param: %s", 1, 2, 3, "RRR");
    System.out.println(formatted);

    boolean y = false;
    boolean z = !y;
    System.out.println("Z = " + z);

    boolean x1 = (2 > 1) || (4 < 3) || (34 * 456 < 9);
    //    AND -> &
    //    OR -> |

    //(5 > 6) && (7 > 8) =  F
    //   !(35<70) = F
    //   (32 => 32) | (98<81) = T
  }

  public void checkInterval(int x, int from, int till) {
    boolean inInterval = (x >= from) && (x <= till);
    if (inInterval) {
      System.out.println("Number " + x + " is in interval (" + from + ", " + till + ")");
      //System.out.println(String.format("Number %d is in interval (%d, %d)", x, from, till));
    } else {
      System.out.println("Number " + x + " is not in interval (" + from + ", " + till + ")");
    }
  }

  public static void printMaxValue(int a, int b) {
    if (a == b) {
      System.out.println("Parameters are equal: " + a);
    } else if (a > b) {
      System.out.println("Max is: " + a);
    } else {
      System.out.println("Max is: " + b);
    }
  }

  public static void printMinValue(double a, double b) {
    if (a == b) {
      System.out.println("Parameters are equal: " + a);
    } else if (a < b) {
      System.out.println("Min is: " + a);
    } else {
      System.out.println("Min is: " + b);
    }
  }

  public static double calculation(int pow) {
    double result = 14 / 209 + 14 * (29 - Math.pow(13, pow) + 14 / 3);
    return result;
  }

  public static int summ(int a, int b) {
    int result = a + b;
    System.out.println("Calculating summ ...");
    return result;
  }

  public static int mult(int a, int b, int c) {
    int result = a * b * c;
    System.out.println(a + " x " + b + " x " + c + " = " + result);
    return result;
  }

  public static void printHello() {
    System.out.println("Hello, hello, ...");
    return;
  }
}
