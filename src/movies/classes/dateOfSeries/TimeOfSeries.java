package movies.classes.dateOfSeries;

import movies.classes.dateOfMovies.TimeOfMovies;

/**
 * Created by carlos on 20/05/17.
 */
public class TimeOfSeries extends TimeOfMovies{

    public TimeOfSeries(int hours,int minutes){
        super(hours,minutes);
        setHours(hours);
    }

    @Override
    public void setHours(int hours){
        if (hours>=0 && hours<=1) {
            super.setHours(hours);
        }else {
            super.setHours(0);
        }
    }
}
