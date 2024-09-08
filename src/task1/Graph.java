package task1;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private final List<Vertex> vertices;

    public Graph() {
        vertices = new ArrayList<>();
    }

    public void addVertex(final String name, final int value) {
        Vertex vertex = new Vertex(name, value);
        vertices.add(vertex);
    }

    public void addEdge(final String fromName, final String toName, final boolean isDirected) {
        Vertex fromVertex = findVertex(fromName);
        Vertex toVertex = findVertex(toName);

        if (fromVertex == null || toVertex == null) {
            throw new IllegalArgumentException("One or both vertices not found");
        }

        fromVertex.addEdge(toVertex);

        if (!isDirected) {
            toVertex.addEdge(fromVertex);
        }
    }

    private Vertex findVertex(String name) {
        for (Vertex vertex : vertices) {
            if (vertex.name.equals(name)) {
                return vertex;
            }
        }
        return null;
    }

    public void printGraph() {
        for (Vertex vertex : vertices) {
            System.out.print(vertex.name + " (" + vertex.value + ") -> ");
            for (Vertex neighbor : vertex.edges) {
                System.out.print(neighbor.name + " (" + neighbor.value + "), ");
            }
            System.out.println();
        }
    }

    private static class Vertex {
        String name;
        int value;
        List<Vertex> edges;

        public Vertex(String name, int value) {
            this.name = name;
            this.value = value;
            this.edges = new ArrayList<>();
        }

        public void addEdge(Vertex vertex) {
            edges.add(vertex);
        }
    }
}