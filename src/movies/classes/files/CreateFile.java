package movies.classes.files;

/**
 * Created by carlos on 14/05/17.
 */
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
public class CreateFile {
    public static void createFile(String name, String filePath){
        Path file=Paths.get(filePath+name);
        if (Files.exists(file)){
            System.out.println("The files already exists");
        }else {
            try {
                Files.createFile(file);
            }catch (IOException e) {
                System.out.println("file couldn't be created");
            }
        }
    }
}