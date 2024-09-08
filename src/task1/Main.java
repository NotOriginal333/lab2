package task1;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex("A", 1);
        graph.addVertex("B", 2);
        graph.addVertex("C", 3);

        graph.addEdge("A", "B", false);
        graph.addEdge("A", "C", true);

        graph.printGraph();
    }
}