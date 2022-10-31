package com.lesson10hw;

public class AmservAutoSalon implements AutoSalon {

    private AbstractCar[] parking = new AbstractCar[8];
    private long balance;

    public AmservAutoSalon(long balance) {
        this.balance = balance;
    }

    @Override
    public int bayCar(AbstractCar car) {
       final long evaluatedPrice = car.evaluatePrice();

        return 0;
    }

    @Override
    public int sellCar(int parkingPlace) {
        return 0;
    }
}
