package Implementations.graphs.basicImplementation;

import java.util.LinkedList;

public class UndirectedAdjacencyList extends AbstractAdjecencyList {


    public UndirectedAdjacencyList(int vertexCount) {
        super(vertexCount);
    }

    public UndirectedAdjacencyList(int vertexCount, LinkedList<Integer>[] adjList) {
        super(vertexCount, adjList);
    }

    @Override
    public void addEdge(int src, int dest) {

        adjList[src].addFirst(dest);

//        adding backwards for undirected graph
        adjList[dest].addFirst(src);

    }

    @Override
    public void removeEdge(int src, int dest) {

        adjList[src].remove(new Integer(dest));

//        removing backwards for undirected graph
        adjList[dest].remove(src);

    }

    public void sayHello() {

    }
}
