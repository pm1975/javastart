package zadanie.io;

import java.util.Scanner;

/**
 * Created by Piotr on 2019-11-05
 */
public class DataReader {
    private Scanner sc = new Scanner(System.in);
    private ConsolePrinter printer;

    public void close() {
        sc.close();
    }

    public int getInt() {
        try {
            return sc.nextInt();
        } finally {
            sc.nextLine();
        }
    }
}
