/**
 * Created by carlos on 13/05/17.
 * @author Carlos Alberto
 */
package movies.interfaces;
import movies.classes.dateOfMovies.DateOfMovies;
import movies.classes.dateOfMovies.TimeOfMovies;
/**
 * This interface is for  movies
 * I want to have a template for all classes in movies.classes.data package
 * to make easier its use
 */
public interface Movie {
    /**
     * This method is to set attribute is for movie's name
     * @param name movie's name
     */
    void setTitle(String name);
    /**
     * set attribute for movie's rate
     * @param stars rate of the movies
     */
    void setRate(int stars);
    /**
     * set attribute for movie's genre
     * @param genre genre of the movie
     */
    void setGenre(String genre);

    /**
     *set attributes for movie's date and
     * @param date date of movie
     * @see movies.classes.dateOfMovies.DateOfMovies
     */
    void setDate(DateOfMovies date);

    /**
     * check out movies.classes.dateOfMovies package
     * @param time movie's running time
     * @see movies.classes.dateOfMovies.TimeOfMovies
     */
    void setTime(TimeOfMovies time);

    /**
     * get movie's title
     * @return title of Movies
     */
    String getTitle();

    /**
     * get movie's rate
     * @return movie's rate from 0 to 5
     */
    int getRate();

    /**
     * get movie's genre
     * @return movie's genre
     */
    String getGenre();

    /**
     * get movie's date
     * @return movie's release date
     * @see movies.classes.dateOfMovies.TimeOfMovies
     */
    DateOfMovies getDate();

    /**
     * get movie's running time
     * @return running tie of movie
     * @see movies.classes.dateOfMovies.TimeOfMovies
     */
    TimeOfMovies getTime();

    /**
     * get String with all information of the movie
     * @return toString of the Class
     */
    String toString();
}
