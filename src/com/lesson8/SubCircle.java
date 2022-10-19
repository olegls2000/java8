package com.lesson8;

import com.shape.Circle;

public class SubCircle extends Circle {
    public void publicMethod(){
        System.out.println(getRadius());
        //privateMethod();
        //packagePrivateMethod();
        protectedMethod();
    }

}
