package Implementations.graphs.detailedImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private List<Edge> edges;
    private Map<Integer,Vertex> vertices;

    public Graph(List<Edge> edges, Map<Integer,Vertex> vertices) {
        this.edges = edges;
        this.vertices = vertices;
    }

    public Graph() {
        this.edges = new ArrayList<>();
        this.vertices = new HashMap<>();
    }

    public void addEdge(int id1, int id2,int weight) {
        Vertex v1 = null;

        if(vertices.containsKey(id1)) {
            v1 = vertices.get(id1);
        }

        Vertex v2 = null;
        if(vertices.containsKey(id2)) {
            v2 = vertices.get(id2);
        }

        Edge edge = new Edge(v1,v2);
        edges.add(edge);

        v1.addAdjacentVertex(edge,v2);
        if(!edge.isDirected()) {
            v2.addAdjacentVertex(edge,v1);
        }
    }

    public void addVertex(Vertex v) {
        if(vertices.containsKey(v.getId()))
            return;

        vertices.put(v.getId(),v);
        for(Edge edge : v.getEdges()) {
            edges.add(edge);
        }
    }


    public Vertex getVertex(int vertexId) {
        return vertices.get(vertexId);
    }

    public void printGraph() {

        for(Vertex v : vertices.values()) {

            System.out.print(v.getData()+"->");
            for(Vertex av : v.getAdjacentVertices()) {
                System.out.print(av.getData()+",");
            }
            System.out.println();

        }

    }


}