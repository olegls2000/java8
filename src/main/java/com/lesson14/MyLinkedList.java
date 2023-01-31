package com.lesson14;

public class MyLinkedList {
    private Element element;

    public void add(Object o) {
        Element newElement = new Element();
        newElement.value = o;
        element.next = newElement;
    }

    public Element get(int i) {
        Element result = element;
        int index = 0;
        while (index <= i) {
            result = result.next;
            index++;
        }
        return result;
    }


}
