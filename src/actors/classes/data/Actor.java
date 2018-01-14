package actors.classes.data;

import movies.interfaces.Movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
/*
class to represent an Actor Object
 */
/**
 * Created by carlos on 9/01/2018
 * Actor
 * This class allows you to create an Actor object
 * Fields in Actor class:
 * name: Actor's name
 * surname: Actor's surname
 * age: Actor's age
 * date of birth: Actor's birth date
 * which uses the format dd/MM/yyyy for example 05/10/2018
 * movies: set of Movies of the actor, allowing to be retrieved by movie's name movie object
 */
public class Actor {
    private String name;
    private String surname;
    private Integer age;
    private Date dateOfBirth;
    private Hashtable<String, Movie> movies = new Hashtable<>();
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Constructor that creates an actor with no movies added yet
     * @param name Actor's name
     * @param surname Actor's surname
     * @param age Actor's age
     * @param date Actor's birth date
     */
    public Actor(String name, String surname, int age, String date){
        setName(name);
        setSurname(surname);
        setAge(age);
        setDateOfBirth(date);
    }

    /**
     * Constructor that creates an actor with a movies set given
     * @param name Actor's name
     * @param surname Actor's surname
     * @param age Actor's age
     * @param date Actor's birth date
     * @param movies Actor's movies set
     */
    public Actor(String name, String surname, int age, String date, Hashtable<String, Movie> movies){
        setName(name);
        setSurname(surname);
        setAge(age);
        setDateOfBirth(date);
        setMovies(movies);
    }

    /**
     * Method to set name attribute
     * @param name Actor's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to set surname attribute
     * @param surname Actor's surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Method to set age attribute
     * @param age Actor's age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Method to set date of birth attribute
     * the date format is dd/MM/yyyy
     * where dd means day of the date,this day has a leading zero if
     * it only consists of one digit , MM for a month that equally has
     * a leading zero if it is of one digit and yyyy for a year of four digits
     * an example date would be 27/10/2018
     * @param dateOfBirth Actor's date of birth
     */
    public void setDateOfBirth(String dateOfBirth) {
        try {
            this.dateOfBirth = formatter.parse(dateOfBirth);
        } catch (ParseException e) {
            System.out.println("Couldn't set date");
        }
    }

    /**
     * Method to set movies set
     * @param movies movies where the actor has appeared
     */
    public void setMovies(Hashtable<String, Movie> movies) {
        this.movies = movies;
    }

    /**
     * Method to get name attribute
     */
    public String getName() {
        return name;
    }

    /**
     * Method to get Surname attribute
    */
    public String getSurname() {
        return surname;
    }

    /**
     * Method to get Age attribute
    */
    public int getAge() {
        return age;
    }

    /**
     * Method to get date of birth attribute
    */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Method to get movies set
    */
    public Hashtable<String, Movie> getMovies() {
        return movies;
    }

    /**
     * Method to add a movie in the actor's set of movie
     * the movie's title will be used as key and its value will be given movie object
     * @param movie movie object to be added to set of Movies in Actor Object
     */
    public void addMovie(Movie movie){
        String key = movie.getTitle();
        if (!isKey(key)){
            this.movies.put(key,movie);
        } else {
            System.out.println("Movie is already");
        }
    }

    /**
     * Method to remove a movie in the actor's set of movie
     * the movie's title will be used as key to find the object and remove key and value
     * @param key titleof movie's object
     */
    public void removeMovie(String key){
        if (isKey(key)){
            this.movies.remove(key);
        } else {
            System.out.println("Movie isn't in the set");
        }
    }

    /**
     * Method to check if movies object is already is in Actor's movie set
     * @param key string to check if it already exists in the set
     * @return true is it exists in the set, false if it isn't
     */
    public boolean isKey(String key){
        return this.movies.containsKey(key);
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + " is " + this.age + " years old and " +
                "was born on " + formatter.format(this.dateOfBirth) + "\nmovies:"
                + getListOfMovies();
    }

    private String getListOfMovies(){
        String movies = "";
        Set<String> keys = this.movies.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            movies = movies + "\n" + key;
        }
        return movies;
    }
}
