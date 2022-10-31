package com.lesson;

public class Lesson5 {
    public static void main(String[] args) {
        int i = 1000;
        while (i <= 1030) {
            System.out.println(i);
            i++;
        }

        int r = 0;
        while (r < 10) {
            if (r % 3 == 0) {
                System.out.println("R = " + r);
            } else {
                continue;
            }

        }
    }
}
