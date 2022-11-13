package com.lesson3;


import static com.util.Utils.*;

public class Lesson3 {
    public static void main(String[] args) {

        int randomNumber = getRandomNumberFromInterval(5, 10);

        int randomNumber1 = getRandomNumberFromInterval(0, 100);
        int randomNumber2 = getRandomNumberFromInterval(500, 510);
        // -> 10..50
        System.out.println(randomNumber);
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);

        int i = 0;
        while (i < 10) {
            System.out.println("Hello");
            i++;
        }

        int j = 0;
        do {
            System.out.println("Hello from Do While");
            j++;
        }
        while (j < 0);


        //30 numbers from interval 1000, 1030.
/*    int k = 0;
    while (k < 30) {
      System.out.println(getRandomNumberFromInterval(1000, 1030));
      k++;
    }*/

        int r = 0;
        while (r < 10) {
            r++;
            if (r % 3 == 0) {
                continue;
            }
            System.out.println("R = " + r);
        }

        for (int l = 0; l < 5; l++) {
            System.out.println("l = " + l);
        }

        // with help of fori loop:  10 ... 20
        for (int k = 10; k <= 20; k++) {
            System.out.println(k);
        }

        // with help of fori loop:  100 95 90 85 ... 0
        for (int k = 100; k >= 0; k -= 5) {
            System.out.print(k);
            if (k == 0) {
                break;
            }
            System.out.print(", ");
        }
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int intArrayLength = intArray.length;
        System.out.println(intArrayLength);
        //System.out.println(intArray[7]);


        double[] doubleArray = {3.7, 7.98898, 5d};
        System.out.println(doubleArray.length);
        System.out.println(doubleArray[2]);

        String[] stringArray = {"Hello", "my", "friend"};
        System.out.println(stringArray.length);
        System.out.println(stringArray[1]);

        Integer [] myArray = new Integer[30];
        int delta = 10;
        for (int k = 0; k < myArray.length; k++) {
            myArray[k] = delta;
            delta += 10;
        }
        printArray(myArray);

        //fulfill array int (size 40) random numbers (10..30)
        Integer [] array1 = generateArray(40, 10, 30);
       printArray(array1);

        //200, 197, 194 ...  10 elements
        Integer[] array2 = new Integer[10];
        int initialValue = 200;
        for (int k = 0; k < array2.length; k++) {
            array2[k] = initialValue;
            initialValue -= 3;
        }
       printArray(array2);

        Integer[] randomArray = generateArray(10, -20, 30);
        int oddCounter = 0;
        for (int k = 0; k < randomArray.length; k++) {
            if (randomArray[k] % 2 == 0) {
                oddCounter++;
            }
        }
        printArray(randomArray);
        System.out.println("Odd element numbers: " + oddCounter);

        Integer[] randomArray1 = generateArray(10, -20, 20);
        int negativeCount = 0;
        for (int k = 0; k < randomArray1.length; k++) {
            if (randomArray1[k] < 0) {
                negativeCount++;
            }
        }
        printArray(randomArray1);
        System.out.println("Negative element numbers: " + negativeCount);

        int maxValue = randomArray1[0];
        for (int k = 1; k < randomArray1.length; k++) {
            if (randomArray1[k] > maxValue) {
                maxValue = randomArray1[k];
            }
        }
        System.out.println("Max Value = " + maxValue);
    }
}
