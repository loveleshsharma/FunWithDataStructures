package Implementations.graphs;

public class Solution {

    public static void main(String...args) {

        UndirectedAdjacencyList undirectedGraph = new UndirectedAdjacencyList(5);
        undirectedGraph.addEdge(0,1);
        undirectedGraph.addEdge(0,4);
        undirectedGraph.addEdge(1,2);
        undirectedGraph.addEdge(1,3);
        undirectedGraph.addEdge(1,4);
        undirectedGraph.addEdge(2,3);
        undirectedGraph.addEdge(3,4);

        undirectedGraph.removeEdge(0,4);
        undirectedGraph.removeEdge(1,3);


        undirectedGraph.printAdjacencyList();


    }
}
