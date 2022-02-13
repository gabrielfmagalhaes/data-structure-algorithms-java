package com.gabrielmagalhaes.datastructure.queue;

public class Main {
    
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue("Hello"); 
        queue.enqueue(40);
        queue.enqueue("World"); 

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqueue(59);
        queue.enqueue("!");
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
