package com.gabrielmagalhaes.datastructure.queue;

import java.util.Arrays;

public class Queue {
    private int size;
    private Object[] elements;

    public Queue(int size) {
        this.size = size;
        this.elements = new Object[size];
    }

    public Object dequeue() {
        if (!isQueueEmpty()) {
            Object result = this.elements[0];
            
            updateArray();

            return result;
        }

        throw new RuntimeException("Queue is full");
    }

    
    public void enqueue(Object newElement) {
        if (!isQueueFull()) {
            for (int i = 0; i < this.elements.length; i++) {
                if (elements[i] == null) {
                    elements[i] = newElement;
                    return;
                }
            }
        }
        
        throw new RuntimeException("Queue is full");
    }

    private void updateArray() {
        this.elements = Arrays.copyOfRange(this.elements, 1, size + 1);
    }

    private boolean isQueueEmpty() {
        return elements[0] == null;
    }
    
    private boolean isQueueFull() {
        return elements[size - 1] != null;
    }
}

