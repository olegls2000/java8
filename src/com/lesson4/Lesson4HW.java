package com.lesson4;

import com.util.Utils;

public class Lesson4HW {
  public static void main(String[] args) {

//* Complete a functionality related to
// swapping Min and Max Element in 2d array


//* Create a method that takes in a
// parameter array of numbers and return an average value


//* Создать метод, который принимает в параметре 2 d
// массив чисел и выводит на печать количество четных
// элементов и нечетных элементов.


    //Oleg Pas:
//* Создайте программу заполняющую массив длиной 20 случайными
// числами от -100 до +100, причем количество положительных и
// отрицательных элементов в массиве должно быть равным ,
// Выведите на экран содержимое массива в строку
    printFiboNumbers(10);
  }

  public static void printFiboNumbers(int n) {
    // 0, 1, 1, 2, 3, 5, ...
    int[] fiboArray = new int[n];
    fiboArray[0] = 0;
    fiboArray[1] = 1;
    for (int i = 2; i < fiboArray.length; i++) {
      fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];
    }
    Utils.printArray(fiboArray);
    byte bb = 7;


  }
}
