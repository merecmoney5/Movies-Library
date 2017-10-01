package movies.classes.tests;

import movies.classes.genres.Genres;

import java.util.Scanner;

/**
 * Created by carlos on 20/05/17.
 */
/*
testFour is to test Genres class
 */
public class testFour {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        Genres.showAllgenres();
        //System.out.println("\nTell me what genres you want\nwith the number or numbers of list separated by comas");
        /*String genres = scanner.next();
        System.out.println(genres);
        Genres.chosenGenres(genres);
        */
        String pathOfFile = "/home/carlos/Documentos/javaRead1";

        Genres.addGenresByAFile(pathOfFile);

        Genres.showAllgenres();

    }
}
