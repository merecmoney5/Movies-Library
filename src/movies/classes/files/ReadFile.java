package movies.classes.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by carlos on 20/05/17.
 */
public class ReadFile {

    private static BufferedReader reader;

    private static void createBufferedReader(String pathOfFile){
        Path file = Paths.get(pathOfFile);
        if (Files.exists(file)){
            try {
                ReadFile.reader = Files.newBufferedReader(file);
            }catch (IOException e){
                System.out.println("error al abrir el archivo");
            }
        }else {
            System.out.println("files does't exist");
        }
    }

    public static void readFile(String pathOfFile){
        createBufferedReader(pathOfFile);

        if (reader != null){
            System.out.println("leyendo el archivo.....\n");
            try {
                String readline = reader.readLine();
                while (readline != null){
                    System.out.println(readline);
                    readline = reader.readLine();

                }
                reader.close();
            }catch (IOException e){
                System.out.println("Error al leer el archivo");
            }

        }

    }

    public static ArrayList<String> getStringOfWordsOfALine(String pathOfFile,int numberOfLine,String pattern) {

        createBufferedReader(pathOfFile);

        ArrayList<String> words = new ArrayList<String>();

        if (reader != null && numberOfLine >= 1) {
            int numbersOfLines = 1;

            try {
                String line = reader.readLine();
                while (line != null && numbersOfLines < numberOfLine){
                    line = reader.readLine();
                    numbersOfLines++;
                }
                if (line != null){
                    for (String word: Arrays.asList(line.split(pattern))){
                        words.add(word.trim());
                    }
                }else {
                    System.out.println("the asked line doesn't exist");
                }

            }catch (IOException e ){
                System.out.println("could't create ArrayList of Strings\nreturn null");
            }

        }else {
            System.out.println("line is less than 1");
        }
        return words;
    }

    public static ArrayList<String> getStringOfWords(String pathOfFile,String pattern) {

        createBufferedReader(pathOfFile);

        ArrayList<String> words = new ArrayList<String>();

        if (reader != null) {
            try {
                String line = "";
                while (line != null){
                    line = reader.readLine();
                    if (line != null){
                        for (String word: Arrays.asList(line.split(pattern))){
                            words.add(word.trim());
                        }
                    }
                }
                reader.close();
            }catch (IOException e ){
                System.out.println("could't create ArrayList of Strings\nreturn null");
            }

        }else {
            System.out.println("line is less than 1");
        }
        return words;
    }
}
