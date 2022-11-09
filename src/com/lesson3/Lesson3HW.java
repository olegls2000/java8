package com.lesson3;

import com.util.Utils;

public class Lesson3HW {
  //
  public static void main(String[] args) {
    //*  Create a Method which: takes in the parameter array of numbers
    // and print out only positive elements;
    double[] array1 = {-3.0, -4, -5};
    printMultiplyBy(array1, 3);
    printMultiplyBy(array1, 4);
    printMultiplyBy(array1, 5);

    System.out.println("-----------------------------------------");

    printPositive(array1);
    double[] array2 = {-5.0d, 6.1d, -3.2d, 8.0, -7.9, -95.7};
    printPositive(array2);

    //* Create a Method which:
    // takes in the parameter array of numbers and
    // prints out only elements that multiplied by n;
    // use while loop. n - is one more parameter in the Method.
    printMultiplyBy(array2, 4);

    //* Create a Method which: takes in the parameter array of numbers
    // and return minimal element.
    double minValue = getMinValue(array2);
    System.out.println("Minimal Element is: " + minValue);

    //[-3, 0, 6, 1]  -> [6, 0, -3, 1]
    //  2
    maxMinElementSwap(array2);

    Integer[][] array2DInit = {{3, 4, 5, 7, 7, 6}, {6, 4, 3, 9, 0}, {3, 3, 3, 2}};
    Utils.print2dArray(array2DInit);
    int[][] array2D = new int[2][2];
  }


  public static void maxMinElementSwap(double[] array) {
    int iMax = 0;
    int iMin = 0;
    for (int i = 1; i < array.length; i++) {
      if (array[i] > array[iMax]) {
        iMax = i;
      }
      if (array[i] < array[iMin]) {
        iMin = i;
      }
    }
    System.out.println(
        "Index of Max element is: " + iMax + ", value = " + array[iMax]);
    System.out.println(
        "Index of Min element is: " + iMin + ", value = " + array[iMin]);
    double temp = array[iMax];
    array[iMax] = array[iMin];
    array[iMin] = temp;
  }

  public static double getMinValue(double[] array) {
    double min = array[0];
    for (int i = 1; i < array.length; i++) {
      double value = array[i];
      if (value < min) {
        min = value;
      }
    }
    return min;
  }

  public static void printMultiplyBy(double[] arr, int multiplyBy) {
    int i = 0;
    while (i < arr.length) {
      double value = arr[i];
      if (value % multiplyBy == 0) {
        System.out.println("index = " + i + ", value = " + value);
      }
      i++;
    }
  }


  public static void printPositive(double[] arr) {
    int i = 0;
    while (i < arr.length) {
      double value = arr[i];
      if (value > 0) {
        System.out.println("index = " + i + ", value = " + value);
      }
      i++;
    }
  }
}
