package z28KlasaString;

import java.util.Scanner;

/**
 * Created by Piotr on 2019-11-02
 */
public class Enigma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę wyrazów:");
        int wordsNumber = input.nextInt();
        input.nextLine();

        String[] words = new String[wordsNumber];

        for (int i = 0; i < wordsNumber; i++) {
            System.out.println("Podaj kolejne słowo:");
            words[i] = input.nextLine();
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < wordsNumber; i++) {
            builder.append(words[i].charAt(words[i].length() - 1));
        }

        System.out.println("Nowe słowo: " + builder.toString());

        input.close();
    }
}
