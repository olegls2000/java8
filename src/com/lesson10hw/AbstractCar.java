package com.lesson10hw;

import java.time.LocalDate;

public abstract class AbstractCar {

    protected static final int AGE_RATE = 8;
    protected static final int TECH_STATE_RATE = 100;

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

    protected int getAge(){
        return LocalDate.now().getYear() - releaseDate;
    }

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
