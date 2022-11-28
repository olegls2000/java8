package com.shape;


import static com.util.Utils.getRandomNumberFromInterval;
import static java.lang.Math.PI;

public class Circle implements WithPerimeter, WithArea {
    private int radius;

    private void privateMethod(){
        System.out.println("Hello from Package private");
    }

    void packagePrivateMethod(){
        System.out.println("Hello from Package private");
    }

    protected void protectedMethod(){
        System.out.println("Hello from Package private");
    }

    public Circle() {
        this.radius = getRandomNumberFromInterval(20, 100);
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI + this.radius;
    }

    @Override
    public void printPerimeter() {
        System.out.println("Circle Perimeter = " + calculatePerimeter());
    }

    @Override
    public double calculateArea() {
        return PI + this.radius * this.radius;
    }

    @Override
    public void printArea() {
        System.out.println("Circle Area = " + calculateArea());
    }


    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    private final void mySuperSECreTMethod(){

        System.out.println("Password is Foo!!! for object with radius: " + radius);
    }
}












































