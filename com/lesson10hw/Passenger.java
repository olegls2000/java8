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
        seatsCheck(seats);
        this.seats = seats;
    }

    //Легкового: ПассажироМеста*КоэфПассажиромест - возрастАвтомобиля*КоэфВозраста+техничСостояние*КоэфТехнСостояния
    @Override
    public long evaluatePrice() {
        return this.seats * SEATS_RATE - getAge(this.getReleaseDate()) * AGE_RATE + super.getTechState() * TECH_STATE_RATE;
    }

    //add seats number 4..7 validation!!!
    private void seatsCheck(int seats){
        //TODO at home
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        seatsCheck(seats);
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passenger)) return false;
        if (!super.equals(o)) return false;

        Passenger passenger = (Passenger) o;

        return getSeats() == passenger.getSeats();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getSeats();
        return result;
    }
}
