package task_correct;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Piotr on 2019-11-29
 */
public class NameReader {
    public static void main(String[] args) throws IOException {
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        try(Scanner sc = new Scanner(new File("namespl.txt"))) {
            while (sc.hasNextLine()) {
                names.add(sc.nextLine());
            }
        }

        System.out.println("Ilość imion w zbiorze: " + names.size());
        System.out.println("Pierwsze imię: " + names.first());
        System.out.println("Ostatnie imię w zbiorze: " + names.last());
    }
}
