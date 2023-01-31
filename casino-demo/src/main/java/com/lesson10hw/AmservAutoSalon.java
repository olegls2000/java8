package com.lesson10hw;

public class AmservAutoSalon implements AutoSalon {

    private AbstractCar[] parking = new AbstractCar[8];
    private long balance;

    public AmservAutoSalon(long balance) {
        this.balance = balance;
    }

    @Override
    public long bayCar(AbstractCar car) throws BalanceException, ParkingException {
        final long evaluatedPrice = car.evaluatePrice();
        //try {
            isBalanceSufficient(evaluatedPrice);
        //} catch (Exception e) {
        //    System.out.println("Handled!!!" + e.getMessage());
        //}

        isParkingPlaceAvailable();
        balance -= evaluatedPrice;
        parking[getFreeParkingPlace()] = car;

        return evaluatedPrice;
    }

    private void isBalanceSufficient(long carPrice) throws BalanceException{
        if (this.balance < carPrice) {
            throw new BalanceException(this.balance);
        }
    }

    private void isParkingPlaceAvailable() throws ParkingException{
        for (AbstractCar slot : parking) {
            if (slot == null) {
                return;
            }
        }
        throw new ParkingException(parking.length);
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
        if (parkingPlace >= parking.length || parkingPlace < 0) {
            throw new RuntimeException("Invalid parking slot number!!");
        }
        final AbstractCar carToSell = parking[parkingPlace];
        if (carToSell == null) {
            throw new RuntimeException("No car on the mentioned parking slot number!!");
        }
        final long sellPrice = (carToSell.evaluatePrice() * 15 / 100) + carToSell.evaluatePrice();
        balance += sellPrice;
        parking[parkingPlace] = null;

        return sellPrice;
    }

    @Override
    public void report() {
        System.out.println("Auto Salon Report:");
        System.out.println(" Balance: " + balance + "EUR");
        System.out.println("Car count is: " + getCarCount());
        System.out.println("---------------------------------------");
    }

    private int getCarCount() {
        int count = 0;
        for (AbstractCar car : parking) {
            if (car != null) {
                count++;
            }
        }
        return count;
    }
}
