package com.animal;

public interface WithLifeDuration {

    int getLifeDuration();

    default void printLifeDuration() {
        System.out.println("Default LD" + getLifeDuration());
    }
}
