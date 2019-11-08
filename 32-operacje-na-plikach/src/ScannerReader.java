package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReader {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        File file = new File(fileName);
        try {
            Scanner scan = new Scanner(file);
            int lines = 0;
            while (scan.hasNextLine()) {
                String name = scan.nextLine();
                System.out.println(name);
                lines++;
            }
            System.out.println("Ilość wierszy w pliku: " + lines);
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie mogę odnaleźć pliku " + fileName);
        }


    }
}
