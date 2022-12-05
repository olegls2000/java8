package com.lesson16hw;

import com.mycollection.MyQueue;
import com.shape.MyCustomException;
import com.shape.Triangle;

import java.util.Queue;

public class Lesson16HomeWork {
    public static void main(String[] args) throws MyCustomException {
        Queue myFifoQueue = new MyQueue();
        System.out.println("Queue size = " + myFifoQueue.size());
        System.out.println("Queue is empty = " + myFifoQueue.isEmpty());
        Triangle triangle = new Triangle(1,1,1);
        Triangle triangle1 = new Triangle(1,1,1);
        Triangle triangle2 = new Triangle(2,2,2);
        Triangle triangle3 = new Triangle(3,3,3);
        System.out.println("Queue contains triangle = " + myFifoQueue.contains(triangle));
        myFifoQueue.add(triangle);
        myFifoQueue.add(triangle1);
        myFifoQueue.add(triangle2);
        myFifoQueue.add(triangle3);
        System.out.println("Queue size = " + myFifoQueue.size());
        System.out.println("Queue is empty = " + myFifoQueue.isEmpty());
        myFifoQueue.remove(triangle1);
        System.out.println("Queue size = " + myFifoQueue.size());
        myFifoQueue.clear();
        System.out.println("Queue size = " + myFifoQueue.size());

    }
}
