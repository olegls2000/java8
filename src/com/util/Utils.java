package com.util;

public class Utils {

  public static int smth = 0;

  public static void printArray(int[] array) {
    System.out.print("[");
    for (int k = 0; k < array.length; k++) {
      System.out.print(array[k]);
      if (k >= array.length - 1) {
        break;
      }
      System.out.print(", ");
    }
    System.out.print("]");
    System.out.println();
  }

  public static void printArrayRevers(int[] array) {
    System.out.print("[");
    for (int k = array.length-1; k >= 0; k--) {
      System.out.print(array[k]);
      if (k >= 1) {
        System.out.print(", ");
      }
    }
    System.out.print("]");
    System.out.println();
  }

  public static void print2dArray(int[][] array2d){
    System.out.print("[");
    for (int i = 0; i < array2d.length; i++) {
      int[] element = array2d[i];
      System.out.print("[");
      for (int j = 0; j < element.length; j++) {
        System.out.print(array2d[i][j]);
        if (j < element.length - 1) {
          System.out.print(", ");
        }
      }
      System.out.print("]");
      System.out.println();
    }
    System.out.print("]");
  }

  public static int[] generateArray(int length, int from, int till) {
    int[] result = new int[length];
    for (int i = 0; i < result.length; i++) {
      result[i] = getRandomNumberFromInterval(from, till);
    }
    return result;
  }

  public static int getRandomNumberFromInterval(int from, int till) {
    int result = (int) (Math.random() * (till - from)) + from;
    return result;
  }
}
