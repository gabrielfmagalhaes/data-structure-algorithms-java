package com.gabrielmagalhaes.datastructure.djikstra;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private static List<Vertex> vertices = new ArrayList<>();
    private static List<Edge> edges = new ArrayList<>();

    public static void main(String[] args) {
        addVertices("INIT");
        addVertices("A");
        addVertices("B");
        addVertices("END");

        addEdges(6, 0, 1);
        addEdges(1, 1, 3);

        addEdges(2, 0, 2);
        addEdges(3, 2, 1);
        addEdges(5, 2, 3);

        Graph graph = new Graph(vertices, edges);

        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);

        dijkstra.calculateShortestPath(vertices.get(0));

        LinkedList<Vertex> path = dijkstra.getPath(vertices.get(vertices.size() - 1));

        path.forEach(System.out::println);
    }

    private static void addVertices(String name) {
        vertices.add(new Vertex(name));
    }
    
    private static void addEdges(int weight, int indexFrom, int indexTo) {
        edges.add(new Edge(weight, vertices.get(indexFrom), vertices.get(indexTo)));
    }
}
