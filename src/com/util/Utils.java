package com.util;

import java.util.ArrayList;
import java.util.Collection;

public class Utils {

    public static int smth = 0;

    public static <T> void printArray(T[] array) {
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

    public static <T> void printArrayRevers(T[] array) {
        System.out.print("[");
        for (int k = array.length - 1; k >= 0; k--) {
            System.out.print(array[k]);
            if (k >= 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static <T> void print2dArray(T[][] array2d) {
        System.out.print("[");
        for (int i = 0; i < array2d.length; i++) {
            final T[] element = array2d[i];
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

    public static Integer[] generateArray(int length, int from, int till) {
        Integer[] result = new Integer[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = getRandomNumberFromInterval(from, till);
        }
        return result;
    }

    public static int getRandomNumberFromInterval(int from, int till) {
        int result = (int) (Math.random() * (till - from)) + from;
        return result;
    }

    public static int getSummFromVarArg(int... integers) {
        int sum = 0;
        for (Integer number : integers) {
            sum += number;// sum = sum + number;
        }
        return sum;
    }

    public static void arrayListOfNumbers() {
        ArrayList<Integer> arrayList = new ArrayList<>(6);
        arrayList.add(Utils.getRandomNumberFromInterval(100, 200));
        arrayList.add(Utils.getRandomNumberFromInterval(100, 200));
        arrayList.add(Utils.getRandomNumberFromInterval(100, 200));
        arrayList.add(Utils.getRandomNumberFromInterval(100, 200));
        arrayList.add(Utils.getRandomNumberFromInterval(100, 200));
        for (Integer x : arrayList) {
            System.out.println(x);
        }
        int min = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            int value = arrayList.get(i);
            if (value < arrayList.get(min))
                min = i;
        }
        System.out.println("Min is: " + arrayList.get(min));

        int max = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            int value = arrayList.get(i);
            if (value > arrayList.get(max))
                max = i;
        }
        System.out.println("Max is: " + arrayList.get(max));

        /* ----------------- */

        int Jmin = arrayList.get(0);
        int Jmax = arrayList.get(0);
        for (Integer i : arrayList) {
            if (i > Jmin)
                Jmin = i;
            if (i < Jmax)
                Jmax = i;
        }
        System.out.println("минимальное число: " + Jmin);
        System.out.println("максимальное число: " + Jmax);
    }
}
