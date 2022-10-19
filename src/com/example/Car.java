package com.example;


import static com.util.Utils.getRandomNumberFromInterval;

public class Car {

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


    public int maxSpeed;
    public String manufacturer;
    public int releaseYear;
}
