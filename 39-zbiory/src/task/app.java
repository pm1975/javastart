package task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Piotr on 2019-11-29
 */
public class app {
    final static String FILE_NAME = "namespl.txt";
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * -1;
            }
        });
        try (Scanner fileReader = new Scanner(new File(FILE_NAME))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                names.add(line);
            }
            System.out.println("names.size() " + names.size());
            System.out.println("names.first() " + names.first());
            System.out.println("names.last() " + names.last());
            for (String name : names) {
                System.out.println(name);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku " + FILE_NAME);
        }
    }

}
