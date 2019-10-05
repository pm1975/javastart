package wprowadzanieDanych;

import java.util.Scanner;

/**
 * Created by Piotr on 2019-10-05
 */
public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalkulator.");
        System.out.println("Podaj pierwszą liczbę i zatwierdź enterem:");
        double a = scanner.nextDouble();
        System.out.println("Podaj działanie matematyczne (+, -, /, *)");
        String znak = scanner.nextLine();
        System.out.println("Podaj drugą liczbę:");
        double b = scanner.nextDouble();

    }
}
