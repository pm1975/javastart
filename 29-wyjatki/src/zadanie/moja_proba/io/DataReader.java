package src.zadanie.moja_proba.io;

import java.util.Scanner;

/**
 * Created by Piotr on 2019-11-04
 */
public class DataReader {
    private Scanner sc = new Scanner(System.in);

    public void close() {sc.close(); }

    public char getChar() {
        char value = sc.next().toLowerCase().charAt(0);
        sc.nextLine();
        return value;
    }
    public double getDouble() {
        double value = sc.nextDouble();
        sc.nextLine();
        return value;
    }
    public void nextLine() {
        sc.nextLine();
    }
}
