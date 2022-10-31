package com.Cars;

public class Lesson10HomeWork {
    public static void main(String[] args) {
        Track track1 = new Track();
        track1.setManufacturer(Manufacturer.TAYOTA);
        track1.setReleaseDate(2005);
        track1.setTechState(6);
        track1.setLoad(2000);

        Track track2 = new Track (2010,7, Manufacturer.MERCEDES, 2500);

        Passenger passenger1 = new Passenger();

        AutoSalon amservAuto = new AmservAutoSalon(150000);
        amservAuto.bayCar(track1);
    }
}
