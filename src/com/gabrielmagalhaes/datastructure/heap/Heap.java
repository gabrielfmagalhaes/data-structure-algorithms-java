package com.gabrielmagalhaes.datastructure.heap;

public class Heap {
    private int size;
    private Object[] elements;

    public Heap(int size) {
        this.size = size;
        this.elements = new Object[size];
    }

    public Object pop() {
        if (!isHeapEmpty()) {
            for (int i = this.elements.length - 1; i >= 0; i--) {
                if (this.elements[i] != null) {
                    Object result = this.elements[i];

                    this.elements[i] = null;
        
                    return result;
                }
            }
        }

        throw new RuntimeException("Heap is empty");
    }

    
    public void push(Object newElement) {
        if (!isHeapFull()) {
            for (int i = 0; i < this.elements.length; i++) {
                if (elements[i] == null) {
                    elements[i] = newElement;
                    return;
                }
            }
        }
        
        throw new RuntimeException("Heap is full");
    }

    private boolean isHeapEmpty() {
        return elements[0] == null;
    }
    
    private boolean isHeapFull() {
        return elements[size - 1] != null;
    }
}

