package com.gabrielmagalhaes.datastructure.heap;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap(10);
        heap.push(10);
        heap.push(20);
        heap.push(30);
        heap.push("Hello"); 
        heap.push(40);
        heap.push("World"); 

        System.out.println(heap.pop());
        System.out.println(heap.pop());

        heap.push(59);
        heap.push("!");
        
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
    }
}
