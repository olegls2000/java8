package com.util;

import java.util.*;

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

    public static List<Integer> generateList(int size, int from, int till) {
        final List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            final Integer randomNumber = getRandomNumberFromInterval(from, till);
            result.add(randomNumber);
        }
        return result;

    }


}
