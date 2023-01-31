package com.lesson2;

public class Lesson2HW {
  public static void main(String[] args) {

    double randomNumber = Math.random();
    System.out.println(randomNumber);


    printMaxDigit(641);
    printMaxDigit(391);
    printMaxDigit(319);
    printMaxDigit(999);


  }

  // Create a Method which gets int number as a
  // parameter (number from interval: 100 …999)
  // and calculates and returns max digit.
  // Output example: "in number 208 the biggest digit is: 8"
  public static void printMaxDigit(int number) {
    int a = number / 100; //-> 2
    int b = number / 10; //-> 21
    b = b % 10;//-> 1
    int c = number % 10; //-> 8
    if (a > b && a > c) {
      System.out.println("Biggest Number: " + a);
    }
    if (b > a && b > c) {
      System.out.println("Biggest Number: " + b);
    }
    if (c > a && c > b) {
      System.out.println("Biggest Number: " + c);
    }
  }
}
