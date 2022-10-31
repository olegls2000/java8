package com.lesson10hw;

import java.time.LocalDate;

public class Passenger extends AbstractCar {
    private int seats;

    public Passenger() {
        super();
        System.out.println("Hello from Passenger constructor");
    }

    //Легкового: ПассажироМеста*КоэфПассажиромест - возрастАвтомобиля*КоэфВозраста+техничСостояние*КоэфТехнСостояния
    @Override
    public long evaluatePrice() {
        int carAge = LocalDate.now().getYear() - getReleaseDate();
        long price = this.seats * 150 - carAge * 8 + super.getTechState() * 100;

        return price;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
