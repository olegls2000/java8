package com.lesson10hw;

public class ParkingException extends Exception {

    private int slotsCount;

    public ParkingException(int slotsCount) {
        this.slotsCount = slotsCount;
    }

    public int getSlotsCount() {
        return slotsCount;
    }
}
