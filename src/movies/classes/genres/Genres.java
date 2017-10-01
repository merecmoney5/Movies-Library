package movies.classes.genres;

import movies.classes.files.ReadFile;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by carlos on 13/05/17.
 */
public class Genres{
    private static ArrayList<String> allgenres;

    private static void setAllgenres() {
        allgenres=new ArrayList<String>();
        Genres.allgenres.add("Action");
        allgenres.add("Animation");
        allgenres.add("Comedy");
        allgenres.add("Documentary");
        allgenres.add("Horror");
        allgenres.add("Musical");
        allgenres.add("Romance");
        allgenres.add("Sport");
        allgenres.add("War");
        allgenres.add("Adventure");
        allgenres.add("Biography");
        allgenres.add("Crime");
        allgenres.add("Drama");
        allgenres.add("Fantasy");
        allgenres.add("History");
        allgenres.add("Music");
        allgenres.add("Mystery");
        allgenres.add("Sci-Fi");
        allgenres.add("Thriller");

    }

    public static void showAllgenres(){
        if (allgenres == null){
            Genres.setAllgenres();
        }
        int i=0;
        for (String genre:allgenres) {
            i++;
            System.out.println(i+" "+genre);
        }
    }

    public static void addGenresByAFile(String pathOfFile){
        ArrayList<String> newGenres = ReadFile.getStringOfWords(pathOfFile,"\n");
        if (newGenres != null){
            for (String genre:newGenres) {
                allgenres.add(genre);
            }
        }else {
            System.out.println("could'n add all new genres");
        }
    }

    public static void chosenGenres(String genres){
        for (String genre:Arrays.asList(genres.split(","))) {
            System.out.println(allgenres.get(Integer.parseInt(genre)-1));
        }
    }

    public static ArrayList<String> getGenres(){
        return allgenres;
    }
}
