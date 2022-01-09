package com.gabrielmagalhaes.datastructure.breadthfirstsearch;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();

        Person gabriel = new Person("Gabriel", "Samba");

        Person john = new Person("John", "Classical");
        Person diego = new Person("Diego", "Samba");
        Person marie = new Person("Marie", "Country");

        Person leonardo = new Person("Leonardo", "Funk");
        Person rafael = new Person("Rafael", "MPB");
        Person lucas = new Person("Lucas", "Rock");

        graph.addVertex(gabriel);
        graph.addVertex(john);
        graph.addVertex(diego);
        graph.addVertex(marie);
        graph.addVertex(leonardo);
        graph.addVertex(rafael);
        graph.addVertex(lucas);

        graph.addEdge(gabriel, john);
        graph.addEdge(gabriel, diego);
        graph.addEdge(gabriel, marie);

        graph.addEdge(john, leonardo);
        graph.addEdge(john, rafael);

        graph.addEdge(marie, leonardo);
        graph.addEdge(marie, lucas);

        //Search for the closest neighbor that enjoys Rock
        System.out.println(graph.breadthFirst());
    }

}
