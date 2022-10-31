package com.home;

public class HomeWork3 {
    public static void main(String[] args) {
        numberMax(999);

    }

    public static void numberMax(int number) {
        int a = number / 100;
        int b = number / 10;
        b = b % 10;
        int c = number % 10;
        if (a > b && a > c) {
            System.out.println("Biggest Number: " + a);
        }
        if (b > a && b > c) {
            System.out.println("Biggest Number: " + b);
        }
    }
}
