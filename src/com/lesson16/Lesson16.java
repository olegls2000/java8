package com.lesson16;

import com.employe.Developer;
import com.employe.QA;
import com.example.Car;
import com.example.CarMaxSpeedComparator;
import com.example.CarReleaseYearComparator;
import com.example.Fox;
import com.lesson10hw.Manufacturer;
import com.lesson10hw.Track;
import com.shappe2d.Circle2d;
import com.shappe2d.Point2d;

import java.util.*;

public class Lesson16 {
    public static void main(String[] args) {
        Developer developer = new Developer(12_000, "Joe", new String[]{"Java", "JS"});
        Developer developer1 = new Developer(12_000, "Joe1", new String[]{"Java", "JS"});
        Developer developer2 = new Developer(12_000, "Joe2", new String[]{"Java", "JS"});
        Developer developer3 = new Developer(12_000, "Joe3", new String[]{"Java", "JS"});
        String name = "Joe3";
        ArrayList<Developer> developerArrayList = new ArrayList<>();
        developerArrayList.add(developer);
        developerArrayList.add(developer1);
        developerArrayList.add(developer2);
        developerArrayList.add(developer3);
        Developer devJoe = null;
        for (Developer dev : developerArrayList) {
            if (dev.getName().equals(name)) {
                devJoe = dev;
                break;
            }
        }
        Map<String, Developer> developerMap = new HashMap<>();
        developerMap.put(developer.getName(), developer);
        developerMap.put(developer1.getName(), developer1);
        developerMap.put(developer2.getName(), developer2);
        developerMap.put(developer3.getName(), developer3);

        devJoe = developerMap.get(name);

        //MAp with 5 entries:  color vs fox

        final Map<String, Fox> foxMap = new HashMap<>();
        Fox fox1 = new Fox("A", 2, "red");
        Fox fox2 = new Fox("B", 1, "white");
        Fox fox3 = new Fox("A", 3, "black");

        foxMap.put(fox1.getColor(), fox1);
        foxMap.put(fox2.getColor(), fox2);
        foxMap.put(fox3.getColor(), fox3);
        System.out.println(foxMap);
        Fox readFox = foxMap.get("red");
        Fox whiteFox = foxMap.get("white");

        Collection<Fox> values = foxMap.values();
        System.out.println("Fox Values only: " + values);
        Set<String> keySet = foxMap.keySet();

        Set<Map.Entry<String, Fox>> entrySet = foxMap.entrySet();

        Map<Manufacturer, Track> autoMap = new HashMap<>();
        autoMap.put(Manufacturer.BMW, null);

        Set<Manufacturer> keySetA = autoMap.keySet();
        Collection<Track> valuesA = autoMap.values();

        Map<Integer, QA> qaMap = new TreeMap<>();

        QA qa1 = new QA(15_000, "Liis", "Apollo");
        qaMap.put(qa1.getSalary(), qa1);
        QA qa2 = new QA(19_000, "Mark", "Onyx");
        qaMap.put(qa2.getSalary(), qa2);
        System.out.println(qaMap);

        Map<Point2d, Circle2d> point2dCircle2dMap = new TreeMap<>();
        Circle2d circle2d1 = new Circle2d(new Point2d(1,1),10);
        Circle2d circle2d2 = new Circle2d(new Point2d(0,0),15);
        point2dCircle2dMap.put(circle2d1.getCenter(), circle2d1);
        point2dCircle2dMap.put(circle2d2.getCenter(), circle2d2);
        System.out.println(point2dCircle2dMap);

        //Map<Car, QA> carQAMap = new TreeMap<>();
        Car car1 = new Car(100, "Audi", 2015);
        //carQAMap.put(car1, qa1);
        Car car2 = new Car(50, "Renault", 2020);
        //carQAMap.put(car2, qa2);
        Car car3 = new Car(150, "Renault", 2018);

        final CarMaxSpeedComparator maxSpeedComparator = new CarMaxSpeedComparator();
        Set<Car> treeSet  = new TreeSet<>(maxSpeedComparator);
        treeSet.add(car1);
        treeSet.add(car2);
        treeSet.add(car3);
        System.out.println("By max Speed: " + treeSet);

        final CarReleaseYearComparator  releaseYearComparator = new CarReleaseYearComparator();
        Set<Car> treeSetSorted  = new TreeSet<>(releaseYearComparator);
        treeSetSorted.add(car1);
        treeSetSorted.add(car2);
        treeSetSorted.add(car3);
        System.out.println("By release year: " + treeSetSorted);

/*        //new object of Comparator
        final Set<Developer> developersSortedBySalary =
                new TreeSet<>(...);*/
        //add 3 developers
        //print out

    }
}
