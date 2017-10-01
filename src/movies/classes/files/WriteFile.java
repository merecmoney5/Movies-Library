package movies.classes.files;

/**
 * Created by carlos on 14/05/17.
 */
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import movies.classes.files.CreateFile;
public class WriteFile {
    public static void writeFile(String sentence,String pathOfFile){
        BufferedWriter writer;
        if (existsFile(pathOfFile)){
            try {
                writer = Files.newBufferedWriter(Paths.get(pathOfFile));
                writer.write(sentence);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                System.out.println("writing process was completed");
            }
        } else {
            System.out.println("File doesn't exist");
        }

    }

    public static void appendInAFile(String sentence,String pathOfFile) throws IOException{
        BufferedWriter writer = null;
        if (existsFile(pathOfFile)){
            try {
                writer = new BufferedWriter(new FileWriter(pathOfFile,true));
                writer.write("\n");
                writer.write(sentence);
            }catch (IOException e){
                System.out.println("operation wasn't completed");
            }finally {
                if (writer != null){
                    writer.close();
                }
                System.out.println("process finished");
            }
        } else {
            System.out.println("File doesn't exist");
        }

    }

    private static boolean existsFile(String pathFile){
        Path pathOfFile = Paths.get(pathFile);
        if (Files.exists(pathOfFile)){
            return true;
        }else {
            return false;
        }
    }
}
