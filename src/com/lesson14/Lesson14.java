package com.lesson14;

import com.shappe2d.Point2d;
import com.util.Utils;


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
        // list.get(2);

        for (String item : list) {
            System.out.println(item);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //Create a list of Integer, add 10 random elements (-100 ... 100);
        //print out List

        List<Integer> integerList = new ArrayList<>(11);
        System.out.println("Size before filling :" + integerList.size());
        for (int i = 0; i < 10; i++) {
            final Integer randomInt = Utils.getRandomNumberFromInterval(-100, 100);
            integerList.add(randomInt);
        }
        int summ = 0;
        for (Integer integer : integerList) {
            summ += integer;
        }

        System.out.println("Size after filling :" + integerList.size());
        //integerList.clear();
        //System.out.println("Size after clear :" +  integerList.size());


        Set<Point2d> point2dSet = new HashSet<>();
        Point2d p1 = new Point2d(2, 2);
        Point2d p2 = new Point2d(2, 2);
        Point2d p3 = new Point2d(5, 5);
        Point2d p4 = new Point2d(9, -13);
        Point2d p5 = new Point2d(9, -13);
        point2dSet.add(p1);
        point2dSet.add(p2);
        point2dSet.add(p3);
        point2dSet.add(p4);
         point2dSet.add(p5);
        System.out.println(point2dSet.size());
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        Set<Integer> integerSet = new HashSet<>();

    }

}
