package com.example;

import java.util.Comparator;

public class CarReleaseYearComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getReleaseYear() - o2.getReleaseYear();
    }
}
