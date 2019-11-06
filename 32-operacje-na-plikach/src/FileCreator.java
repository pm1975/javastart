import java.io.File;
import java.io.IOException;

/**
 * Created by Piotr on 2019-11-06
 */
public class FileCreator {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        File file = new File(fileName);

        boolean fileExists = file.exists();
        if (!fileExists) {
            try {
                fileExists = file.createNewFile();
            } catch (IOException e) {
                System.out.println("Nie udało się utworzyć pliku");
            }
        }
        if (fileExists)
            System.out.println("Plik " + fileName + " istnieje lub został utworzony.");
    }
}
