package com.gabrielmagalhaes.datastructure.breadthfirstsearch;

public class Edge {
    Vertex fromVertex;
    Vertex toVertex;

    public Edge(Vertex fromVertex, Vertex toVertex) {
        this.fromVertex = fromVertex;
        this.toVertex = toVertex;
    }

    public Vertex getToVertex() {
        return toVertex;
    }
}
