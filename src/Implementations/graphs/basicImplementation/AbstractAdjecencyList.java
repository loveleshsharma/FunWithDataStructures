package Implementations.graphs.basicImplementation;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractAdjecencyList {

    protected int vertexCount;
    protected LinkedList<Integer> adjList[];

    public AbstractAdjecencyList(int vertexCount) {
        this.vertexCount = vertexCount;
        adjList = new LinkedList[vertexCount];

        for(int i=0;i<vertexCount;i++) {
            adjList[i] = new LinkedList<Integer>();
        }
    }

    public AbstractAdjecencyList(int vertexCount,LinkedList<Integer> adjList[]) {
        this.vertexCount = vertexCount;
        this.adjList = adjList;
    }

    public abstract void addEdge(int src, int dest);
    public abstract void removeEdge(int src,int dest);

    public void printAdjacencyList() {

        if(adjList == null || adjList.length < 1)
            return;

        for(int i=0;i<vertexCount;i++) {
            System.out.println(adjList[i].toString());
        }

    }

}
