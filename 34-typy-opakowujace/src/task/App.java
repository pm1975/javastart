package task;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Piotr on 2019-11-15
 */
public class App {
    static final String FILE = "file.txt";
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File(FILE))) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                String line = sc.nextLine();
                sum += Integer.valueOf(line);
            }
            System.out.println(sum);
            BigInteger sum2 = new BigInteger("0");
            for (int i = 3; i < 5; i++) {
                String line = sc.nextLine();
                sum2 = sum2.add(new BigInteger(line));
            }
            System.out.println(sum2);
        } catch (FileNotFoundException e) {
            System.out.println("Nie mogę znaleźć pliku " + FILE);
        }
    }

}
