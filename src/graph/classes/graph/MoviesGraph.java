package graph.classes.graph;

import actors.classes.data.Actor;
import movies.classes.data.RegularMovie;
import movies.classes.dateOfMovies.DateOfMovies;
import movies.classes.dateOfMovies.TimeOfMovies;
import movies.interfaces.Movie;

/*
 * Class to create a Actor-Movie Graph
 * Where a vertex can be an Actor or a Movie, and there is an edge between them
 * if and only if those actor have been in that movies
 * these graph by their properties is bipartite
 * where set v1 is the set of actor and v2 is the set of movies
 */
public class MoviesGraph {
    public static void main(String[] args){
        //creating 3 hunger games movies
        Movie movie1 = new RegularMovie("The Hunger Games: Catching Fire",5," Action, Adventure, Mystery",new TimeOfMovies(2,26),new DateOfMovies());
        Movie movie2 = new RegularMovie("The Hunger Games", 5, " Action, Adventure, Mystery",new TimeOfMovies(2, 22), new DateOfMovies());
        Movie movie3 = new RegularMovie("The Hunger Games: Mockingjay - Part 1", 5, " Action, Adventure, Mystery",new TimeOfMovies(2, 3), new DateOfMovies());

        //creating 3 hunger games actors
        Actor actor1 = new Actor("Jennifer", "Shrader Lawrence", 28, "15/06/1990");
        Actor actor2 = new Actor("Liam", "Hemsworth", 28, "13/01/1990");
        Actor actor3 = new Actor("Joshua Ryan", "Hutcherson", 26, "12/10/1991");

        //creating graph
        Graph graph1 = new Graph();

        //adding vertices
        graph1.addVertex("actor1", actor1);
        graph1.addVertex("actor2", actor2);
        graph1.addVertex("actor3", actor3);
        graph1.addVertex("movie1", movie1);
        graph1.addVertex("movie2", movie2);
        graph1.addVertex("movie3", movie3);
    }
}
