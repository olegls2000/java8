package com.mycollection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

// First In First Out

public class MyQueue implements Queue {
    private Object[] value = new Object[0];

    @Override
    public int size() {
        System.out.println("size...");
        return value.length;
    }

    @Override
    public boolean isEmpty() {
        return value.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object element : value) {
            if (element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    //   []
    //    [ o ]

    @Override
    public boolean add(Object o) {
        System.out.println("add...");
        int newArraySize = value.length + 1;
        Object[] newArray = new Object[newArraySize];

        newArray[newArray.length - 1] = o;
        for (int i = 0; i < value.length; i++) {
            newArray[i] = value[i];
        }
        value = newArray;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        System.out.println("remove...");
        int removeCount = 0;
        for (Object element : value) {
            if (element.equals(o)) {
                removeCount++;
            }
        }
        if (removeCount == 0) {
            return false;
        }
        // [ 1, 1, 2, 3] -> [2, 3]
        int newSize = value.length - removeCount;
        Object[] newValue = new Object[newSize];

        int newValueIndex = 0;
        for (Object oldElement : value) {
            if (oldElement.equals(o)) {
                continue;
            }
            newValue[newValueIndex] = oldElement;
            newValueIndex++;
        }
        value = newValue;
        return true;
    }



    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
        System.out.println("clear...");
        value = new Object[0];
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }
}
