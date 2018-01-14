package graph.classes.tests;

import graph.classes.graph.Graph;
import graph.classes.vertice.VertexForData;
import movies.classes.data.RegularMovie;
import movies.classes.dateOfMovies.DateOfMovies;
import movies.classes.dateOfMovies.TimeOfMovies;
import movies.interfaces.Movie;

/*
 * Class to create a vertex with data object and check if it work properly
 *
 */
public class Test2 {
    public static void main(String[] args){
        Graph graph1 = new Graph();

        //add vertex with a data object
        Movie movieOne = new RegularMovie("The Hunger Games: Catching Fire",5," Action, Adventure, Mystery",new TimeOfMovies(2,26),new DateOfMovies());

        graph1.addVertex("Object1", movieOne);

        VertexForData vertexD1 = (VertexForData)graph1.getVertex("Object1");
        System.out.println("1 " + vertexD1);


        //adding again vertex with data object with the same object
        graph1.addVertex("Object1", movieOne);

        System.out.println("\n2 " + graph1);



    }
}
