package z28KlasaString;

import java.util.Scanner;

/**
 * Created by Piotr on 2019-11-02
 */
public class MojaProba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość słów:");
        int number = scanner.nextInt();
        scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            System.out.println("Podaj " + (i + 1) + " słowo: ");
            String word = scanner.nextLine();
            stringBuilder.append(word.substring(word.length() - 1));
        }
        System.out.println("Nowe słowo: " + stringBuilder.toString());
        scanner.close();
    }
}
