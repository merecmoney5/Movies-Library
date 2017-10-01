package movies.classes.tests;

import movies.classes.files.ReadFile;
import java.util.ArrayList;

/**
 * Created by carlos on 20/05/17.
 */
public class testFive {
    public static void main(String[] args){
        String pathOfFile = "/home/carlos/Documentos/javaRead1";
        //ReadFile.readFile(pathOfFile);

        ArrayList<String> words = ReadFile.getStringOfWordsOfALine(pathOfFile,2,",");

        System.out.println(words);

        pathOfFile = "/home/carlos/Documentos/javaRead";

        words = ReadFile.getStringOfWordsOfALine(pathOfFile,1,",");

        System.out.println(words);

        System.out.println(ReadFile.getStringOfWordsOfALine(pathOfFile,-1,","));

        System.out.println(ReadFile.getStringOfWordsOfALine(pathOfFile,2,","));

        System.out.println(ReadFile.getStringOfWordsOfALine(pathOfFile,4," "));

        System.out.println(ReadFile.getStringOfWordsOfALine(pathOfFile,5,":"));

        System.out.println(ReadFile.getStringOfWordsOfALine(pathOfFile,5,""));

        pathOfFile = "/home/carlos/Documentos/javaRead1";

        System.out.println(ReadFile.getStringOfWords(pathOfFile,"\n"));

    }
}
