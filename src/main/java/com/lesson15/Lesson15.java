package com.lesson15;

import com.lesson10hw.Manufacturer;
import com.lesson10hw.Passenger;
import com.shape.Circle;
import com.shape.Square;
import com.shape.Triangle;
import com.shappe2d.Point2d;

import java.util.*;

public class Lesson15 {
    public static void main(String[] args) throws Exception {
        Point2d p11 = new Point2d(1,1);
        Point2d p22 = new Point2d(2,2);
        Point2d p22x = new Point2d(2,2);
        Point2d p33 = new Point2d(3,3);
        Point2d p33x = new Point2d(3,3);

        Set<Point2d> point2dSet = new HashSet<>();
        System.out.println(point2dSet.add(p11));
        System.out.println(point2dSet.add(p22));
        System.out.println(point2dSet.add(p22x));
        System.out.println(point2dSet.add(p33));
        System.out.println(point2dSet.add(p33x));
        System.out.println("Set size = " + point2dSet.size());



        for (Point2d point: point2dSet) {
            System.out.println(point);
        }

        Triangle tr1 = new Triangle(5,5,5);
        Triangle tr2 = new Triangle(5,5,5);
        Triangle tr3 = new Triangle(6,5,5);

        Set<Triangle> triangles = new HashSet<>();
        triangles.add(tr1);
        triangles.add(tr2);
        triangles.add(tr3);
        System.out.println(triangles);

        //Circle circle1 = new Circle();
       // add 300 circle objects to the hashSet

/*        for (int i = 0; i < point2dSet.size(); i++) {
            //point2dSet.get(i);
        }*/

        Passenger car1 = new Passenger(2020, 30,
                Manufacturer.TOYOTA,5);
        System.out.println(car1.hashCode());

        Passenger car2 = new Passenger(2020, 30,
                Manufacturer.BMW,5);
        System.out.println(car2.hashCode());

       Map<Manufacturer, Passenger> carsMap = new HashMap<>();
       carsMap.put(car1.getManufacturer(), car1);
       carsMap.put(car2.getManufacturer(), car2);
        System.out.println(carsMap);

        Passenger bmw = carsMap.get(Manufacturer.BMW);
        Passenger toyota = carsMap.get(Manufacturer.TOYOTA);
        System.out.println(bmw);
        System.out.println(toyota);

        Map<Long, Passenger> mapPriceVsCar = new HashMap<>();
        mapPriceVsCar.put(car1.evaluatePrice(), car1);
        mapPriceVsCar.put(car2.evaluatePrice(), car2);

        Square square = new Square();
        Double area = square.calculateArea();

        Map<Double, Square> mapAreaVsSquare = new HashMap<>();
        for (int i = 0; i < 600; i++) {
            Square sq = new Square();
            mapAreaVsSquare.put(sq.calculateArea(), sq);
        }
        System.out.println("Square count: " + mapAreaVsSquare.size());
        Set<Double> keySet = mapAreaVsSquare.keySet();
        Collection<Square> values = mapAreaVsSquare.values();
        System.out.println(values);








    }
}
