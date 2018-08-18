package Implementations.graphs.basicImplementation;

import java.util.LinkedList;

public class DirectedAdjacencyList extends AbstractAdjecencyList {

    public DirectedAdjacencyList(int vertexCount) {
        super(vertexCount);
    }

    public DirectedAdjacencyList(int vertexCount, LinkedList<Integer> adjList[]) {
        super(vertexCount,adjList);
    }


    @Override
    public void addEdge(int src, int dest) {

        adjList[src].addFirst(dest);

    }

    @Override
    public void removeEdge(int src, int dest) {

        adjList[src].remove(new Integer(dest));

    }
}
