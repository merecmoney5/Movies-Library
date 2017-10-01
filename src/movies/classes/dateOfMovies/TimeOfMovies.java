package movies.classes.dateOfMovies;

/**
 * Created by carlos on 13/05/17.
 */
// check out Import movies.classes.dateOfSeries.TimeOfSeries;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * Class to set Time of what a Movie can last
 */
public class TimeOfMovies {
    int hours;
    int minutes;

    /*public TimeOfMovies(){
        Calendar time = Calendar.getInstance(TimeZone.getTimeZone("GTM-5"));
        setHours(time.get(Calendar.HOUR_OF_DAY));
        setMinutes(time.get(Calendar.MINUTE));
    }*/

    /**
     * constructor to create a TimeOfMovies Object to manipulate
     * Time of Movies
     * @param hours hours of the movie
     * @param minutes minutes of the movie
     */
    public TimeOfMovies(int hours,int minutes){
        setHours(hours);
        setMinutes(minutes);
    }

    /**
     * method to set Hours of Movie
     * If it equal or higher than zero or equal or lower
     * than four so set given value
     * if it's not between those values
     * set zero as default
     * @param hours movie's hours
     */
    public void setHours(int hours) {
        if (hours>=0 && hours<=4){
            this.hours=hours;
        }else {
            this.hours=0;
        }
    }

    /**
     * method to get remaining minutes besides hours of movie
     * for example a movie can last 1 hours and 20 minutes
     * the remaining minutes are 20 of movie's time
     * @param minutes movie's minutes
     */
    public void setMinutes(int minutes) {
        if (minutes>=0 && minutes<60){
            this.minutes = minutes;
        }else {
            this.minutes=0;
        }

    }

    /**
     * method to get movie's hours
     * @return movie's hours
     */
    public int getHours() {
        return this.hours;
    }

    /**
     * method to get movie's minutes
     * @return movie's minutes
     */
    public int getMinutes() {
        return this.minutes;
    }

    /**
     * get a String of Movie's Time
     * @return a string with the format hours h minutes m
     */
    public String toString(){
        return getHours()+"h "+getMinutes()+"m\n";
    }
}
