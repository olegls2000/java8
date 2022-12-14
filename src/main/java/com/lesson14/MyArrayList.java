package com.lesson14;

public class MyArrayList {
    private Object[] container;

    public MyArrayList(int capacity) {
        this.container = new Object[capacity];
    }

    public Object get(int i){
        return container[i];
    }

    public void add(Object o) {
    Object[] newContainer = new Object[container.length+20];

    }


}
