package com.util;

import java.util.ArrayList;

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
        ArrayList<Integer> arrayList = new ArrayList<>(1000);
        for (int i = 0; i < 10; i++) {
            final Integer randomInt = Utils.getRandomNumberFromInterval(100, 200);
            System.out.println(randomInt);
        }
        int min = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (min > arrayList.size()) {
                min = arrayList.size();
                System.out.println("Min is:" + arrayList.size());
            }
        }
        int max = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (max < arrayList.size()) {
                max = arrayList.size();
                System.out.println("Max is:" + arrayList.size());
            }
        }
        int maxJ = 0;
        int minJ = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (maxJ < arrayList.size()) {
                maxJ = minJ;
                System.out.println("Max is:" + arrayList.size());
            }
        }
    }
}
