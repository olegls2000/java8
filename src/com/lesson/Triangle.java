package com.lesson;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle (int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0){
            System.out.println("Invalid, only positive number");
            throw new RuntimeException("Invalid, only positive number");
        }
        if (a + b >= c || b + c >= a || a + c >=b){
            System.out.println("Invalid");
            throw new RuntimeException("Invalid");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Triangle created!");
    }
    public void setA(int a) {
        if (a <= 0){
            System.out.println("sides can be only positive numbers");
            throw new RuntimeException("sides can be only positive numbers");
        }
//        if (a + this.b <= this.c || this.b + this.c <=)
    }
}
