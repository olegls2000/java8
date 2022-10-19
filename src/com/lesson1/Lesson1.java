package com.lesson1;

public class Lesson1 {

  public static void main(String[] args) {
    System.out.println("____________");
    System.out.println("|          |");
    System.out.println("|          |");
    System.out.println("-----------");

    //Formatting: CTRL + ALT + L

    int i = 10;
    i = 11;
    i = i + 5;
    System.out.println(i);

    byte bMax = 127;
    byte bMin = -127;
    System.out.println(bMax);
    short sMax = 32767;
    short sMin = -32767;
    //bMax = sMax;
    sMax = bMax;
    int intVar = 847_329_821;
    long longVar = 999_999_999_999_999_999l;
    double doubleVar1 = 3.89_898d;
    double doubleVar2 = 3.0d;
    double doubleVar3 = 3d;
    float floatVar = 3.0f;
    boolean booleanVar = true;
    char charVar = '7';


    String stringVar = "My String )))";

    int result = 10 / 5;

    String printString = "10 / 5 = " + result;

    System.out.println(printString);
    printString = printString + "!";

    System.out.println(printString);

    //TODO: fix smth ..
    /*
    sadsDS
    dss
    SD
     */

    int result2 = 12 % 5;
    System.out.println("12 % 5 = " + result2 + "!");

    long f = 23l + 1l;

    double dd = 3l + 34.0d;

    int custedInt = (byte) 50.5;

    System.out.println(custedInt);

    double doubleUpCust = 2;
    System.out.println(doubleUpCust);
    //Create a program that calculate and print out next state: 121 * ⅓ +388^3
    // Output example: 121 * ⅓ +388^3 = ...
    double result1 = 121 * 1 / 3 + Math.pow(383, 3);
    System.out.println("121 * ⅓ +388^3 =" + result1);


    System.out.println(Math.pow(25, 0.5));

    //      14/209+14ˣ(29-13²+14/3)

    int myVar = 31;
    double result3 = myVar / 209 + myVar * (29 - 13 * 13 + myVar / 3);

    String printExpression = myVar + " /209+ " + myVar + " ˣ(29-13²+ " + myVar + " /3) = ";
    System.out.println(printExpression + result3);




    int value = 1;
    //value = value + 1;
    value++;
    ++value;
    System.out.println("value = " + value);
    //value = value - 1;
    value--;
    System.out.println("value = " + value);

    //value = value + 5;
    value += 5;
    System.out.println("value = " + value);

    //value = value - 5;
    //value = value * 10;
    //value = value / 3;

    int t = 10;
    int post = t++; // -> t = t + 1;
    int pre = ++t;

    System.out.println("PostFix increment: " + post);
    System.out.println("PreFix increment: " + pre);



  }
}
