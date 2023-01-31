package com.animal;

public class Wolf implements WithLifeDuration{
    private int lifeDuration;
    private int weight;
    private int speed;

    public Wolf(int lifeDuration, int weight, int speed) {
        this.lifeDuration = lifeDuration;
        this.weight = weight;
        this.speed = speed;
    }

    @Override
    public int getLifeDuration() {
        return lifeDuration;
    }
}
