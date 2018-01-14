package actors.classes.tests;

import actors.classes.data.Actor;
import movies.classes.data.RegularMovie;
import movies.classes.dateOfMovies.DateOfMovies;
import movies.classes.dateOfMovies.TimeOfMovies;
import movies.interfaces.Movie;

/*
Test to check if Actor Class works properly
 */
public class Test1 {
    public static void main(String[] args){

        //creating an Actor Object
        Actor actor1 = new Actor("Gal" , "Gadot" , 37, "30/05/1985");

        //print actor1 object
        System.out.println("1 " + actor1);

        //add movie to a movie set

        //creating a movie object
        Movie movieOne = new RegularMovie("The Hunger Games: Catching Fire",5," Action, Adventure, Mystery",new TimeOfMovies(2,26),new DateOfMovies());

        //adding to actor1 set
        actor1.addMovie(movieOne);

        //printing object
        System.out.println("\n2 " + actor1);

        //adding a movie that's already in the set
        actor1.addMovie(movieOne);

        //printing object
        System.out.println("\n3 " + actor1);

        //removing movieOne from actor1 set
        actor1.removeMovie(movieOne.getTitle());

        //printing object
        System.out.println("\n4 " + actor1);


    }
}
