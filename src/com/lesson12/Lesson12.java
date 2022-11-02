package com.lesson12;

import com.lesson10hw.AmservAutoSalon;
import com.lesson10hw.AutoSalon;
import com.lesson10hw.Manufacturer;
import com.lesson10hw.Track;

public class Lesson12 {
    public static void main(String[] args) {
        final AutoSalon amserv = new AmservAutoSalon(200_000l);
        amserv.report();


        final Track track1 = new Track(2005, 6, Manufacturer.BMW, 1_000);
        final Track track2 = new Track(2005, 6, Manufacturer.BMW, 2_000);
        amserv.bayCar(track1);


        amserv.bayCar(track2);


        amserv.sellCar(1);

        amserv.sellCar(0);
        amserv.report();
    }
}
