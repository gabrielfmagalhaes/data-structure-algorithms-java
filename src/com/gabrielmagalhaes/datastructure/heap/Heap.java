package com.gabrielmagalhaes.datastructure.heap;

public class Heap {
    private int size;
    private Object[] items;

    public Heap(int size) {
        this.size = size;
        this.items = new Object[size];
    }

    public Object pop() {
        if (!isHeapEmpty()) {
            for (int i = this.items.length - 1; i >= 0; i--) {
                if (this.items[i] != null) {
                    Object result = this.items[i];

                    this.items[i] = null;
        
                    return result;
                }
            }
        }

        throw new RuntimeException("Heap is empty");
    }

    
    public void push(Object newElement) {
        if (!isHeapFull()) {
            for (int i = 0; i < this.items.length; i++) {
                if (items[i] == null) {
                    items[i] = newElement;
                    return;
                }
            }
        }
        
        throw new RuntimeException("Heap is full");
    }

    private boolean isHeapEmpty() {
        return items[0] == null;
    }
    
    private boolean isHeapFull() {
        return items[size - 1] != null;
    }
}

