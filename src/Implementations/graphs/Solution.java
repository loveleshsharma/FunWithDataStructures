package Implementations.graphs;

import Implementations.graphs.basicImplementation.AbstractAdjecencyList;
import Implementations.graphs.basicImplementation.UndirectedAdjacencyList;
import Implementations.graphs.detailedImplementation.Graph;
import Implementations.graphs.detailedImplementation.Vertex;

import java.util.Arrays;

public class Solution {

    public static void main(String...args) {

        new Solution().detailedSolution();

    }


    public void detailedSolution() {

        Graph g = new Graph();

        g.addVertex(new Vertex(0).setData(0));
        g.addVertex(new Vertex(1).setData(1));
        g.addVertex(new Vertex(2).setData(2));
        g.addVertex(new Vertex(3).setData(3));
        g.addVertex(new Vertex(4).setData(4));

        g.addEdge(0,1,0);
        g.addEdge(0,4,0);
        g.addEdge(1,4,0);
        g.addEdge(1,3,0);
        g.addEdge(1,2,0);
        g.addEdge(2,3,0);
        g.addEdge(3,4,0);

        g.printGraph();
        System.out.println(g.getVertex(3).getAdjacentVertices());
        System.out.println(g.getVertex(3).getEdges());


    }

    public void basicSolution() {

        AbstractAdjecencyList undirectedGraph = new UndirectedAdjacencyList(5);
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
