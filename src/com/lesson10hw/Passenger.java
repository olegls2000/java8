package com.lesson10hw;

public class Passenger extends AbstractCar {
    private static final int SEATS_RATE = 150;

    private int seats;

    public Passenger() {
        super();
        System.out.println("Hello from Passenger constructor");
    }

    public Passenger(int releaseDate, int techState, Manufacturer manufacturer, int seats) {
        super(releaseDate, techState, manufacturer);
        this.seats = seats;
    }

    //Легкового: ПассажироМеста*КоэфПассажиромест - возрастАвтомобиля*КоэфВозраста+техничСостояние*КоэфТехнСостояния
    @Override
    public long evaluatePrice() {
        return this.seats * SEATS_RATE - getAge() * AGE_RATE + super.getTechState() * TECH_STATE_RATE;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
