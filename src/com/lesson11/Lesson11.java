package com.lesson11;

import com.lesson10hw.AbstractCar;
import com.lesson10hw.Manufacturer;
import com.lesson10hw.Track;

public class Lesson11 {
    public static void main(String[] args) {
        Track track1 = new Track(2005, 6, Manufacturer.BMW, 5_000);
        Track track2 = new Track(2005, 6, Manufacturer.BMW, 5_000);

        Track track3 = track1;

        boolean refEqually = track1 == track2;
        System.out.println(refEqually);

        boolean refEqually1_3 = track1 == track3;
        System.out.println(refEqually1_3);

        boolean contentEqual = track1.equals(track2);
        System.out.println("equals().." + contentEqual);



    }

}
