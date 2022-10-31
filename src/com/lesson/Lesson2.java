package com.lesson;

public class Lesson2 {
    public static void main(String[] args) {

        double result = calulation(2);

        System.out.println("Hello, hello ");

        printHello();

        int summa = sum(10, 11);
    }

    public static double calulation(int pow) {

        double result = 14 / 209 + 14 * (29 - Math.pow(13, pow) + 14 / 3);
        return result;
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void printHello() {
        System.out.println("Hello!");
    }

}
