package com.animal;

import com.shape.WithArea;
import com.shape.WithPerimeter;

public class Fox implements WithLifeDuration{
    private int lifeDuration;
    private int weight;
    private String[] food;

    public Fox(int lifeDuration, int weight, String[] food) {
        this.lifeDuration = lifeDuration;
        this.weight = weight;
        this.food = food;
    }

    @Override
    public int getLifeDuration() {
        return lifeDuration;
    }

    @Override
    public void printLifeDuration() {
        System.out.println("Fox life duration is - " + lifeDuration);
    }
}
