package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTesterTryWithResources {
    public static void main(String[] args) throws IOException {
        String fileName = "testFile.txt";
        var fileReader = new FileReader(fileName);
        var reader = new BufferedReader(fileReader);

        try (
                fileReader;
                reader;
        ) {
            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Ilość wierszy w pliku: " + lines);
        }

    }
}
