package com.lesson10hw;

public abstract class AbstractCar {
    private int releaseDate;
    private int techState;
    private Manufacturer manufacturer;

    public AbstractCar(int releaseDate, int techState, Manufacturer manufacturer) {
        this.releaseDate = releaseDate;
        this.techState = techState;
        this.manufacturer = manufacturer;
    }

    public AbstractCar() {
        System.out.println("Hello from AbstractCar constructor");
    }

    public abstract long evaluatePrice();

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getTechState() {
        return techState;
    }

    public void setTechState(int techState) {
        this.techState = techState;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
