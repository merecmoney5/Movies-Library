package movies.classes.tests;

import movies.classes.data.RegularMovie;
import movies.classes.dateOfMovies.DateOfMovies;
import movies.classes.dateOfMovies.TimeOfMovies;
import movies.interfaces.Movie;

public class test1 {
    public static void main(String[] args){

        Movie movieOne = new RegularMovie("The Hunger Games: Catching Fire",5," Action, Adventure, Mystery",new TimeOfMovies(2,26),new DateOfMovies());

        System.out.println(movieOne);
    }
}
