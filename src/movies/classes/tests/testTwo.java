package movies.classes.tests;

/**
 * Created by carlos on 14/05/17.
 */
import movies.classes.files.CreateFile;
import movies.classes.files.WriteFile;
import movies.classes.data.RegularMovie;
import movies.classes.dateOfMovies.DateOfMovies;
import movies.classes.dateOfMovies.TimeOfMovies;
import movies.classes.genres.Genres;
import movies.interfaces.Movie;

import java.io.IOException;

public class testTwo {
    public static void main(String[] args){
        Movie movie1 = new RegularMovie("The Hunger Games: Catching Fire",5," Action, Adventure, Mystery",new TimeOfMovies(2,26),new DateOfMovies(22,11,2013));
        Movie movie2 = new RegularMovie("The Hunger Games: Mockingjay - Part 1",5," Action, Adventure, Mystery",new TimeOfMovies(2,3),new DateOfMovies(21,11,2014));


        CreateFile.createFile("movie1","/home/carlos/Programming/Java/Movies-Library/createdFiles/");
        String path = "/home/carlos/Programming/Java/Movies-Library/createdFiles/movie1";
        WriteFile.writeFile(movie1.toString(),path);
        try {
            WriteFile.appendInAFile(movie2.toString(),path);
        }catch (IOException e){
            System.out.println("Error appending text");
        }

    }
}
