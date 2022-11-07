package com.lesson10hw;

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
        return getAge(this.getReleaseDate()) * AGE_RATE + super.getTechState() * TECH_STATE_RATE + load * LOAD_RATE;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != Track.class) {
            return false;
        }

        final Track custedObject = (Track) obj;

        if (custedObject.getLoad() != this.getLoad()) {
            return false;
        }

        if (custedObject.getTechState() != this.getTechState()) {
            return false;
        }
        if (custedObject.getManufacturer() != this.getManufacturer()) {
            return false;
        }

        if (custedObject.getReleaseDate() != this.getReleaseDate()) {
            return false;
        }

        return true;
    }


    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
}