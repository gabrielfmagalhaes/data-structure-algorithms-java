package com.gabrielmagalhaes.datastructure.breadthfirstsearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private Person person;

    private List<Edge> enterEdges;
    private List<Edge> exitEdges;

    public Vertex(Person person) {
        this.person = person;
        this.enterEdges = new ArrayList<>();
        this.exitEdges = new ArrayList<>();
    }

    public Person getPerson() {
        return person;
    }

    public List<Edge> getEnterEdges() {
        return enterEdges;
    }

    public List<Edge> getExitEdges() {
        return exitEdges;
    }

    public void addEnterEdge(Edge edge) {
        enterEdges.add(edge);
    }

    public void addExitEdge(Edge edge) {
        exitEdges.add(edge);
    }
}
