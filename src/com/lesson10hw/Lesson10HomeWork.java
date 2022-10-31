package com.lesson10hw;

public class Lesson10HomeWork {
    public static void main(String[] args) {
        AbstractCar track2 = new Track(2010,
                7,
                Manufacturer.MERCEDES,
                2500);

        AbstractCar passenger1 = new Passenger(2011,
                5,
                Manufacturer.TOYOTA,
                5);

        final AutoSalon amservAuto = new AmservAutoSalon(150_000l);
        amservAuto.bayCar(passenger1);


    }
}
