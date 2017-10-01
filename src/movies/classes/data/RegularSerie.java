package movies.classes.data;

import movies.classes.dateOfMovies.DateOfMovies;
import movies.classes.dateOfMovies.TimeOfMovies;
import movies.interfaces.Serie;

/**
 * Created by carlos on 20/05/17.
 */
public class RegularSerie extends RegularMovie implements Serie {

    private int numberOfEpisodes;
    private int numberOfSeasons;

    public RegularSerie(String name,int stars,String genre,TimeOfMovies time,DateOfMovies date,int numberOfEpisodes,int numberOfSeasons){
        super(name, stars, genre, time, date);
        setNumberOfEpisodes(numberOfEpisodes);
        setNumberOfSeasons(numberOfSeasons);
    }

    @Override
    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes=numberOfEpisodes;
    }

    @Override
    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons=numberOfSeasons;
    }

    @Override
    public int getNumberOfEpisodes() {
        return this.numberOfEpisodes;
    }

    @Override
    public int getNumberOfSeasons() {
        return this.numberOfSeasons;
    }

    @Override
    public String toString(){
        return "The serie is "+getTitle()+"\nits rate is "+getRate()+"\ngenre is "+getGenre()+"\nthe time is "+getTime()+"\nfinally its date is "+getDate()+"\n"+"it has "+getNumberOfEpisodes()+" episodes and \n"+getNumberOfSeasons()+" seasons\n";
    }
}
