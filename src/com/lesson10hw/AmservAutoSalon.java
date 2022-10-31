package com.lesson10hw;

public class AmservAutoSalon implements AutoSalon {

    private AbstractCar[] parking = new AbstractCar[8];
    private long balance;

    public AmservAutoSalon(long balance) {
        this.balance = balance;
    }

    @Override
    public long bayCar(AbstractCar car) {
        final long evaluatedPrice = car.evaluatePrice();
        if (isBalanceSufficient(evaluatedPrice) && isParkingPlaceAvailable()) {
            balance -= evaluatedPrice;
            parking[getFreeParkingPlace()] = car;
            return evaluatedPrice;
        }
        return -1;
    }
    private boolean isBalanceSufficient(long carPrice) {
        return this.balance < carPrice;
    }
    private boolean isParkingPlaceAvailable() {
        for (AbstractCar car : parking) {
            if (car == null) {
                return true;
            }
        }
        return false;
    }
    private int getFreeParkingPlace() {
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null) {
                return i;
            }
        }
        throw new RuntimeException("No Free Places!!!");
    }

    @Override
    public long sellCar(int parkingPlace) {
        //TODO at home
        balance +=0;
        return 0;
    }

    @Override
    public void report() {
        //TODO at home
    }
}
