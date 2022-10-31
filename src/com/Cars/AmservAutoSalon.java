package com.Cars;

public class AmservAutoSalon implements AutoSalon{

    private AbstractCar[] parking = new AbstractCar[8];
    private long balance;

    public AmservAutoSalon(long balance) {
        this.parking = parking;
    }

    @Override
    public int bayCar() {
        return 0;
    }

    @Override
    public int sellCar(int parkingPlace) {
        return 0;
    }
}
