package com.lesson14;

import com.shappe2d.Point2d;


import java.util.*;

public class Lesson14 {
    public static void main(String[] args) {
/*        MyLinkedList myLinkedList = new MyLinkedList();
        Object el = myLinkedList.get(10);
        Object el55 = myLinkedList.get(55);*/

        final List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.remove(0);
        int size = list.size();
        list.get(2);

        for (String item : list) {
            System.out.println(item);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //Create a list of Integer, add 10 random elements (-100 ... 100);
        //print out List



        Set<Point2d> point2dSet = new HashSet<>();
        Point2d p1 = new Point2d(2, 2);
        Point2d p2 = new Point2d(2, 2);
        point2dSet.add(p1);
        point2dSet.add(p2);
        System.out.println(point2dSet.size());
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }

}
