package com.lesson13;

import com.shappe2d.Point2d;
import com.util.Utils;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Lesson13 {
    public static void main(String[] args) {
        String str = "dasfsda";
        //str = 4;
        //var str = "dasfsad";
        //str = 7;

        int i; //0;
        Integer integer; //null;

        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7};
        Utils.printArray(intArray);

        Double[] doublesArray = {1.5, 2.6, 3d, 4.0, 5d, 6d, 7d};
        Utils.printArray(doublesArray);
        Float[] floats = null;

        String[] stringArray = {"1.5", "2.6", "3d", "4.0"};
        Utils.printArray(stringArray);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        System.out.println(integerArrayList.size());// ->0
        integerArrayList.add(1);//  ->  Big O(1)
        integerArrayList.add(2);
        integerArrayList.add(3);
        System.out.println(integerArrayList.size()); // ->3
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(6);
        integerArrayList.add(789898);
        System.out.println(integerArrayList.size()); // ->4

        Integer variable =  integerArrayList.get(5);

        ArrayList<Point2d> point2dArrayList = new ArrayList<>();
        point2dArrayList.add(new Point2d(5, 8));
        point2dArrayList.add(new Point2d(6, 7));
        Point2d pointFromCollection = point2dArrayList.get(100007);


        LinkedList<Double> doubleLinkedList  = new LinkedList<>();
        doubleLinkedList.add(12.0);  //  Big O(n)
        doubleLinkedList.add(16.0);
        doubleLinkedList.add(19.0);

        doubleLinkedList.get(9999);





    }
}
