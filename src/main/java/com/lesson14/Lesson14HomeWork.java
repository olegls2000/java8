package com.lesson14;

import com.util.Utils;

import java.util.List;

public class Lesson14HomeWork {
    public static void main(String[] args) {
        List<Integer> generatedList =
                Utils.generateList(5, 0, 100);
        System.out.println(generatedList.size());
        System.out.println(generatedList);
        generatedList = swapMinMax(generatedList);
        System.out.println("After swap: ");
        System.out.println(generatedList);
    }

    private static List<Integer> swapMinMax(List<Integer> list) {
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(maxIndex)) {
                maxIndex = i;
            }
            if (list.get(i) < list.get(minIndex)) {
                minIndex = i;
            }
        }
        System.out.println("Max element: " + list.get(maxIndex));
        System.out.println("Min element: " + list.get(minIndex));

        Integer temp = list.get(maxIndex);
        list.set(maxIndex, list.get(minIndex));
        list.set(minIndex, temp);

        return list;
    }
}
