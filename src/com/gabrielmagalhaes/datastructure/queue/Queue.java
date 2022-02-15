package com.gabrielmagalhaes.datastructure.queue;

import java.util.Arrays;

public class Queue {
    private int size;
    private Object[] items;

    public Queue(int size) {
        this.size = size;
        this.items = new Object[size];
    }

    public Object dequeue() {
        if (!isQueueEmpty()) {
            Object result = this.items[0];
            
            updateArray();

            return result;
        }

        throw new RuntimeException("Queue is full");
    }

    
    public void enqueue(Object newElement) {
        if (!isQueueFull()) {
            for (int i = 0; i < this.items.length; i++) {
                if (items[i] == null) {
                    items[i] = newElement;
                    return;
                }
            }
        }
        
        throw new RuntimeException("Queue is full");
    }

    private void updateArray() {
        this.items = Arrays.copyOfRange(this.items, 1, size + 1);
    }

    private boolean isQueueEmpty() {
        return items[0] == null;
    }
    
    private boolean isQueueFull() {
        return items[size - 1] != null;
    }
}

