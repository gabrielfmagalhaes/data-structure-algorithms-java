package com.gabrielmagalhaes.datastructure.djikstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DijkstraAlgorithm {

    private final List<Edge> edges;
    private Set<Vertex> settledVertices;
    private Set<Vertex> unSettledVertices;
    private Map<Vertex, Vertex> predecessors;
    private Map<Vertex, Integer> distance;

    public DijkstraAlgorithm(Graph graph) {
        this.edges = new ArrayList<>(graph.edges());

        settledVertices = new HashSet<>();
        unSettledVertices = new HashSet<>();
        distance = new HashMap<>();
        predecessors = new HashMap<>();
    }

    public void calculateShortestPath(Vertex init) {
        distance.put(init, 0);
        unSettledVertices.add(init);

        while(unSettledVertices.size() > 0) {
            Vertex vertex = getMinimum(unSettledVertices);
            settledVertices.add(vertex);
            unSettledVertices.remove(vertex);
            findMinimalDistances(vertex);
        }
    }

    private void findMinimalDistances(Vertex vertex) {
        List<Vertex> adjacentVertices = getNeighbors(vertex);

        for (Vertex destination : adjacentVertices) {
            if (getShortestDistance(destination) > 
                getShortestDistance(vertex) + getDistance(vertex, destination)) {
                
                distance.put(destination, 
                    getShortestDistance(vertex) + getDistance(vertex, destination));
                
                predecessors.put(destination, vertex);
                unSettledVertices.add(destination);
            }
        }

    }

    private int getDistance(Vertex vertex, Vertex destination) {
        int result = -1;

        for (Edge edge : edges) {
            if (edge.source().equals(vertex) && edge.destination().equals(destination)) {
                result = edge.weight();
            }
        }

        return result;
    }

    private List<Vertex> getNeighbors(Vertex vertex) {
        List<Vertex> neighbors = new ArrayList<>();
        
        for (Edge edge : edges) {
            if (edge.source().equals(vertex) && !isSettled(edge.destination())) {
                neighbors.add(edge.destination());
            }
        }
        
        return neighbors;
    }

    private boolean isSettled(Vertex vertex) {
        return settledVertices.contains(vertex);
    }

    private Vertex getMinimum(Set<Vertex> vertices) {
        Vertex minimum = null;

        for (Vertex vertex : vertices) {
            if (minimum == null) {
                minimum = vertex;
            } else {
                if (getShortestDistance(vertex) < getShortestDistance(minimum)) {
                    minimum = vertex;
                }
            }
        }

        return minimum;
    }

    private int getShortestDistance(Vertex destination) {
        Integer n = distance.get(destination);

        return n == null ? Integer.MAX_VALUE : n;
    }

    public LinkedList<Vertex> getPath(Vertex destination) {
        LinkedList<Vertex> path = new LinkedList<>();
        Vertex step = destination;

        if (predecessors.get(step) == null) {
            return null;
        }

        path.add(step);

        while (predecessors.get(step) != null) {
            step = predecessors.get(step);
            path.add(step);
        }

        Collections.reverse(path);
        return path;
    }
}
