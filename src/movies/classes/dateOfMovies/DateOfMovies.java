package movies.classes.dateOfMovies;

/**
 * Created by carlos on 13/05/17.
 */
import java.util.Calendar;
import java.util.TimeZone;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.Year;


/**
 * This class is to the date attribute of movies
 */
public class DateOfMovies {
    private int day;
    private int month;
    private int year;

    /**
     * This constructor is to set today's date if non parameter is given
     * Time Zone used is GMT-5
     */
    public DateOfMovies(){
        Calendar date=Calendar.getInstance(TimeZone.getTimeZone("GMT-5"));
        setDay(date.get(Calendar.DAY_OF_MONTH));
        setMonth(date.get(Calendar.MONTH)+1);
        setYear(date.get(Calendar.YEAR));
    }

    /**
     * This constructor is to set movie's date if day,month and year are given
     * @param day this parameter is to set movies's day of its date
     * @param month this parameter is to set movies's month of its date
     * @param year this parameter is to set movies's year of its date
     */
    public DateOfMovies(int day,int month,int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    /**
     * this method is to set day of movie's date
     * if day is less than zero or greater than 31
     * it will be set as the default day which is the current day
     * @param day day of movie's date
     */
    public void setDay(int day){
        if (day > 0 && day < 32){
            this.day=day;
        }else {
            this.day=MonthDay.now().getMonthValue();
        }

    }

    /**
     * this method is to set month of movie's date
     * if given parameter is less than zero or higher than 13
     * the month will be set as today's month
     * @param month month of movie's date
     */
    public void setMonth(int month){
        if (month>0 && month<13){
            this.month=month;
        }else {
            this.month=YearMonth.now().getMonthValue();
        }
    }

    /**
     * this method is to set year of movie's date
     * if the year is less than 1999
     * the year will be set as today´s year
     * @param year year of movie's date
     */
    public void setYear(int year){
        if (year>1999){
            this.year=year;
        }else {
            this.year=Year.now().getValue();
        }

    }

    /**
     * Get Day of Movie´s Date
     * @return Day of Movie´s Date
     */
    public int getDay(){
        return this.day;
    }

    /**
     * Get Month of Movie´s Date
     * @return Month of Movie´s Date
     */
    public int getMonth(){
        return this.month;
    }

    /**
     * Get Year of Movie´s Date
     * @return Year of Movie´s Date
     */
    public int getYear(){
        return this.year;
    }

    /**
     * Get a String that represents Movie´s Date which follows
     * next format:
     * Day/Month/Year
     * @return a String with a format DAY/MONTH/YEAR
     */
    public String toString(){
        return getDay()+"/"+getMonth()+"/"+getYear();
    }
}
