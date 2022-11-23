package com.lesson4;

import com.util.Utils;

public class Lesson4 {

  public static void main(String[] args) {
    Integer[] array1 = Utils.generateArray(3, 0, 100);
    Integer[] array2 = Utils.generateArray(3, 0, 100);
    Integer[] array3 = Utils.generateArray(3, 0, 100);

    Integer[][] array2d = {array1, array2, array3};
    Utils.print2dArray(array2d);

    int iMin = 0;
    int jMin = 0;
    int iMax = 0;
    int jMax = 0;

    for (int i = 0; i < array2d.length; i++) {
      for (int j = 0; j < array2d[i].length; j++) {
        if (array2d[i][j] < array2d[iMin][jMin]) {
          iMin = i;
          jMin = j;
        }
      }
    }
    System.out.println("Min Value in 2d array is: " + array2d[iMin][jMin] +
                           " with indexes: [" + iMin + ", " + jMin + "]");

    Utils.printArray(array1);
    Utils.printArrayRevers(array1);
  }
}
