package com.gabrielmagalhaes.datastructure.breadthfirstsearch;

import java.util.ArrayList;
import java.util.List;

public class Graph {
     private List<Vertex> vertices;
     private List<Edge> edges;

     public Graph() {
          this.vertices = new ArrayList<>();
          this.edges = new ArrayList<>();
     }

     public void addVertex(Person person) {
          Vertex vertex = new Vertex(person);

          vertices.add(vertex);
     }

     public void addEdge(Person personSource, Person personNeighbor) {
          Vertex vertexSource = getVertex(personSource);
          Vertex vertexNeighbor = getVertex(personNeighbor);

          Edge edge = new Edge(vertexSource, vertexNeighbor);

          vertexSource.addEnterEdge(edge);
          vertexSource.addExitEdge(edge);

          edges.add(edge);
     }

     private Vertex getVertex(Person person) {
          for (Vertex vertex: vertices) {
               if (vertex.getPerson().getName().equals(person.getName())) {
                    return vertex;
               }
          }

          return null;
     }

     public Person breadthFirst() {
          List<Vertex> visitedVertices = new ArrayList<>();
          List<Vertex> queueVertices = new ArrayList<>();

          queueVertices.add(vertices.get(0));

          while(queueVertices.size() > 0) {
               Vertex visited = queueVertices.get(0);

               for (int i = 0; i < visited.getExitEdges().size(); i++) {
                    Vertex neighbor = visited.getExitEdges().get(i).toVertex;

                    if (doesHeEnjoyRock(neighbor.getPerson())) {
                         return neighbor.getPerson();
                    }

                    if (!visitedVertices.contains(neighbor)) {
                         queueVertices.add(neighbor);
                         visitedVertices.add(neighbor);
                    }

               }

               queueVertices.remove(0);
          }
          return null;
     }

     public boolean doesHeEnjoyRock(Person person) {
          return person.getMusicalGenre().equals("Rock");
     }
}
