package com.shape;

public class Triangle implements WithPerimeter {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) throws MyCustomException  {
        checkPositive(a);
        checkPositive(b);
        checkPositive(c);
        checkCombination(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Triangle created!");
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public void printPerimeter() {
        System.out.println("Triangle perimeter is: " + calculatePerimeter());
    }

    public void setA(int a) throws MyCustomException {
        checkPositive(a);
        checkCombination(a, this.b, this.c);
        this.a = a;
    }

    public void setB(int b) throws MyCustomException  {
        checkPositive(b);
        checkCombination(this.a, b, this.c);
        this.b = b;
    }

    public void setC(int c) throws MyCustomException  {
        checkPositive(c);
        checkCombination(this.a, this.b, c);
        this.c = c;
    }

    private void checkPositive(int side) throws MyCustomException {
        if (side <= 0) {
            System.out.println("Sides can be only positive numbers!");
            throw new MyCustomException("Sides can be only positive numbers");
        }
    }

    private void checkCombination(int sideA, int sideB, int sideC) throws MyCustomException {
        if (sideA + sideB <= sideC || sideB + sideC <= sideA || sideA + sideC <= sideB) {
            System.out.println("Invalid sides combination!");
            throw new MyCustomException("Invalid sides combination");
        }
    }

    public void triangleSpecificMethod() {
        System.out.println("hello from Triangle");
    }
}
