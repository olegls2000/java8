package com.Cars;

public class Passenger extends AbstractCar{

    private int seats;

    public Passenger() {
        super();
        System.out.println("Hello from Passenger constructor");
    }

    public long evaluatePrice() {
        int carAge = LocalDate.now().getYear() - getReleaseDate();

        long price = this.seats * 150 - carAge * 8 + super.getTechState() * 100;

        return price;
    }

    public int getSeats() { return seats;}
}
