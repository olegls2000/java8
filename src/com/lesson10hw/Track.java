package com.lesson10hw;

import java.time.LocalDate;

public class Track extends AbstractCar {

    private static final int LOAD_RATE = 15;

    private int load;

    public Track() {
        // super();
        System.out.println("Hello from Track constructor");
    }

    public Track(int releaseDate,
                 int techState,
                 Manufacturer manufacturer,
                 int load) {
        super(releaseDate, techState, manufacturer);
        this.load = load;
    }

    @Override
    public long evaluatePrice() {
        return getAge() * AGE_RATE + super.getTechState() * TECH_STATE_RATE + load * LOAD_RATE;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
}
