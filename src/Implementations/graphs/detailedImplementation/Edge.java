package Implementations.graphs.detailedImplementation;

public class Edge {

    private Vertex v1,v2;
    private int weight;
    private boolean isDirected;

    public Edge(Vertex v1, Vertex v2) {

        this.v1 = v1;
        this.v2 = v2;
        this.isDirected = false;
        this.weight = 0;

    }

    public Edge(Vertex v1, Vertex v2, int weight) {

        this.v1 = v1;
        this.v2 = v2;
        this.isDirected = false;
        this.weight = weight;

    }

    public Edge(Vertex v1, Vertex v2, boolean isDirected) {

        this.v1 = v1;
        this.v2 = v2;
        this.isDirected = isDirected;
        this.weight = 0;

    }

    public Edge(Vertex v1, Vertex v2, int weight, boolean isDirected) {

        this.v1 = v1;
        this.v2 = v2;
        this.isDirected = isDirected;
        this.weight = weight;

    }

    public Vertex getVertex1() {
        return v1;
    }

    public Vertex getVertex2() {
        return v2;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isDirected() {
        return isDirected;
    }

    @Override
    public String toString() {
        return v1.getData()+"-"+v2.getData();
    }
}
