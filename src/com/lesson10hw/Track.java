package com.lesson10hw;

import java.time.LocalDate;

public class Track extends AbstractCar {
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
        int carAge = LocalDate.now().getYear() - getReleaseDate();
        long price = carAge * 8 + super.getTechState() * 100 + load * 15;

        return price;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
}
