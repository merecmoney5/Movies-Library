/**
 * Created by carlos on 13/05/17.
 */
package movies.classes.data;
import movies.classes.dateOfMovies.DateOfMovies;
import movies.classes.dateOfMovies.TimeOfMovies;
import movies.interfaces.Movie;
public class RegularMovie implements Movie {

    private String name;
    private int stars;
    private String genre;
    private TimeOfMovies time;
    private DateOfMovies date;

    public RegularMovie(String name,int stars,String genre,TimeOfMovies time,DateOfMovies date){
        setTitle(name);
        setRate(stars);
        setGenre(genre);
        setTime(time);
        setDate(date);
    }

    @Override
    public void setTitle(String name) {
        this.name=name;
    }

    @Override
    public void setRate(int stars) {
        this.stars=stars;
    }

    @Override
    public void setGenre(String genre) {
        this.genre=genre;
    }

    @Override
    public void setDate(DateOfMovies date) {
        if ((date.getDay() < 1 || date.getDay() > 31) && (date.getMonth() < 0 || date.getMonth() > 13)){
            System.out.println("\n***Setting Default Date***");
            this.date=new DateOfMovies();
        }else {
            this.date = new DateOfMovies(date.getDay(),date.getMonth(),date.getYear());
        }

    }

    @Override
    public void setTime(TimeOfMovies time) {
        /*if(time.getHours()==0){
            this.time=new TimeOfMovies();
        }*/
        this.time = new TimeOfMovies(time.getHours(),time.getMinutes());

    }

    @Override
    public final String getTitle() {
        return this.name;
    }

    @Override
    public int getRate() {
        return this.stars;
    }

    @Override
    public String getGenre() {
        return this.genre;
    }

    @Override
    public TimeOfMovies getTime() {
        return this.time;
    }

    @Override
    public DateOfMovies getDate() {
        return this.date;
    }

    @Override
    public String toString(){
        return "The movie is "+getTitle()+"\nits rate is "+getRate()+"\ngenre is "+getGenre()+"\nthe time is "+getTime()+"\nfinally its date is "+getDate()+"\n";
    }
    
}
