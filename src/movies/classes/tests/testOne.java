package movies.classes.tests;

/**
 * Created by carlos on 13/05/17.
 */
/*
This test is to test creation of RegularMovie Objects and their methods
 */
import movies.classes.data.RegularMovie;
import movies.classes.dateOfMovies.DateOfMovies;
import movies.classes.dateOfMovies.TimeOfMovies;
import movies.classes.genres.Genres;
import movies.interfaces.Movie;

import java.util.Scanner;

public class testOne {
    public static void main(String[] args){

        DateOfMovies dateOne=new DateOfMovies(22,11,2013);
        System.out.println(dateOne);

        /*Movie movieOne = new RegularMovie("The Hunger Games: Catching Fire",5," Action, Adventure, Mystery",new TimeOfMovies(2,26),dateOne);*/

        Movie movieOne = new RegularMovie("The Hunger Games: Catching Fire",5," Action, Adventure, Mystery",new TimeOfMovies(2,26),new DateOfMovies());

        System.out.println(movieOne);

        String hola = "hola";

        Movie movie1 = new RegularMovie("Los juegos del hambre: Sinsajo - Parte1 ",5,"Action, Adventure, Sci-Fi",new TimeOfMovies(2,3),new DateOfMovies());
        System.out.println(new DateOfMovies());
    }
}
