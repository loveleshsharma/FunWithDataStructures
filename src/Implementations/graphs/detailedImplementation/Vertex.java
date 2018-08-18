package Implementations.graphs.detailedImplementation;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int id;
    private int data;
    private List<Edge> edges;
    private List<Vertex> adjacentVertices;

    public Vertex(int id) {
        this.id = id;
        edges = new ArrayList<>();
        adjacentVertices = new ArrayList<>();
    }

    public int getData() {
        return data;
    }

    public Vertex setData(int data) {
        this.data = data;
        return this;
    }

    public void addAdjacentVertex(Edge e, Vertex v) {
        edges.add(e);
        adjacentVertices.add(v);
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public List<Vertex> getAdjacentVertices() {
        return adjacentVertices;
    }

    public int getDegree() {
        return edges.size();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
}
