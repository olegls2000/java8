package com.home;

public class HomeWork2 {
    public static void main(String[] args) {
        number(90);
        number(10);
        number(49);
        number(70);
    }

    public static void number(int x) {
        if (x > 50) {
            System.out.println(x + " is closer to 100");
        } else if (x < 50) {
            System.out.println(x + " is not closer to 100");
        }
    }
}
