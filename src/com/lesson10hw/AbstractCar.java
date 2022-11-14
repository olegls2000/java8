package com.lesson10hw;

import java.time.LocalDate;

public abstract class AbstractCar {

    protected static final int AGE_RATE = 8;
    protected static final int TECH_STATE_RATE = 100;

    private int releaseDate;
    private int techState;
    private Manufacturer manufacturer;

    public AbstractCar(int releaseDate, int techState, Manufacturer manufacturer) {
        ageCheck(releaseDate);
        this.releaseDate = releaseDate;
        this.techState = techState;
        this.manufacturer = manufacturer;
    }

    public AbstractCar() {
        System.out.println("Hello from AbstractCar constructor");
    }

    public abstract long evaluatePrice();

    protected int getAge(int releaseDate) {
        return LocalDate.now().getYear() - releaseDate;
    }

    //not older then 20 years!!!!
    private void ageCheck(int releaseDate) {
        int age = getAge(releaseDate);
        if (age > 20) {
            throw new RuntimeException("Car is too old!");
        }
    }

    //1..9
    private void techStateCheck(int techState) {
        //TODO at home
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        ageCheck(releaseDate);
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

    @Override
    public String toString() {
        return  "releaseDate=" + releaseDate +
                ", techState=" + techState +
                ", manufacturer=" + manufacturer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractCar)) return false;

        AbstractCar that = (AbstractCar) o;

        if (getReleaseDate() != that.getReleaseDate()) return false;
        if (getTechState() != that.getTechState()) return false;
        return getManufacturer() == that.getManufacturer();
    }

    @Override
    public int hashCode() {
        int result = getReleaseDate();
        result = 31 * result + getTechState();
        result = 31 * result + (getManufacturer() != null ? getManufacturer().hashCode() : 0);
        return result;
    }
}
