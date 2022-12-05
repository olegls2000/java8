package com.example;


import static com.util.Utils.getRandomNumberFromInterval;

public class Car /*implements Comparable<Car>*/{

/*    //max speed only!!!!
    @Override
    public int compareTo(Car o) {
        //return o.getMaxSpeed() - this.maxSpeed;
        return o.getReleaseYear() - this.releaseYear;
    }*/

    public Car() {
        System.out.println("Hello from DEFAULT constructor");
    }

    public Car(int maxSpeedParam,
               String manufacturerParam,
               int releaseYearParam) {
        this.maxSpeed = maxSpeedParam;
        this.manufacturer = manufacturerParam;
        this.releaseYear = releaseYearParam;
        System.out.println("Hello from all param " +
                "Constructor constructor");
    }

    public Car(String manufacturerParam) {
        this.manufacturer = manufacturerParam;
        this.maxSpeed = getRandomNumberFromInterval(15, 250);
        this.releaseYear = getRandomNumberFromInterval(2008, 2022);
    }

    public Car(int maxSpeedParam,
               String manufacturerParam) {
        this.maxSpeed = maxSpeedParam;
        this.manufacturer = manufacturerParam;
    }


    private int maxSpeed;
    private String manufacturer;
    private int releaseYear;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", manufacturer='" + manufacturer + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
