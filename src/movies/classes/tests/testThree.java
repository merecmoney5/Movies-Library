package movies.classes.tests;

import movies.classes.data.RegularMovie;
import movies.classes.data.RegularSerie;
import movies.classes.dateOfMovies.DateOfMovies;
import movies.classes.dateOfMovies.TimeOfMovies;
import movies.classes.dateOfSeries.TimeOfSeries;
import movies.interfaces.Movie;
import movies.interfaces.Serie;

/**
 * Created by carlos on 20/05/17.
 */
public class testThree {
    public static void main(String[] args){
        Serie serieOne = new RegularSerie("Breaking Bad",5,"Crime, Drama, Thriller",new TimeOfSeries(0,49),new DateOfMovies(20,1,2008),62,5);
        System.out.println(serieOne);
        //here there's no cast due to Serie is a Movie
        Movie serieTwo = serieOne;
        System.out.println(serieTwo);
        //here can't be possible due to Movie is not a Regular Movie
        //by that it must be casted
        RegularMovie serieThree = (RegularMovie)serieTwo;
        System.out.println(serieThree);
        Movie seriewo = serieThree;
        System.out.println(seriewo instanceof Movie);
        System.out.println("hola");
    }

}
