package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę.");
        int number = 0;
        boolean error = true;
        do {
            try {
                number = sc.nextInt();
                error = false;
                System.out.println("Wczytano poprawną liczbę");
            } catch (InputMismatchException ex) {
                System.err.println("Nie podałeś liczby całkowitej, spróbuj jeszcze raz: ");
                sc.nextLine();
            }
        } while (error);
        System.out.println("Podałeś: " + number);
        sc.close();
    }
}
