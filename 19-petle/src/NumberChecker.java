import java.util.Scanner;

/**
 * Created by Piotr on 2019-10-07
 */
public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj liczbę:");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                System.out.println("Liczba " + number + " jest parzysta.");
            } else {
                System.out.println("Liczba " + number + " jest nieparzysta.");
            }
        }
        sc.close();
    }
}
