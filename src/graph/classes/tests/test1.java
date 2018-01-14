package graph.classes.tests;

import graph.classes.graph.Graph;
import graph.classes.vertice.*;

public class test1 {
    public static void main(String[] args){
        Graph graph1 = new Graph();
        Vertex node;
        //created a K_1,8 graph

        for (int i = 0; i < 9; i++) {
            node = new Vertex("hola" + Integer.toString(i+1));
            graph1.addVertex(Integer.toString(i+1));
        }

        for (int i = 0; i < 8; i++) {
            graph1.addEdge("1",Integer.toString(i+2));
        }

        System.out.println(graph1);

        graph1.removeVertex("1");

        System.out.println("after removing vertex with id 1 \n" + graph1);

        System.out.println("reading vertex with id 1 and Vertex with id vertex1");

        System.out.println("adding vertex with id 1 and node id 1");

        graph1.addVertex("1");

        for (int i = 0; i < 8; i++) {
            graph1.addEdge("1",Integer.toString(i+2));
        }

        System.out.println(graph1);

        //add a vertex that is already in the graph

        graph1.addVertex("1");

        System.out.println("\n2 " + graph1);

        System.out.println("\nget a vertex\n");

        System.out.println(graph1.getVertex("1"));
        System.out.println(graph1.getVertex("hola3"));

        System.out.println("\nadd vertex with Vertex object");

        System.out.println();
    }
}
