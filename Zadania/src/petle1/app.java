package petle1;

import java.util.Scanner;

/**
 * Created by Piotr on 2019-10-09
 */
public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ile liczb będziesz wprowadzał:");
        int number = sc.nextInt();
        int sum = 0;
//        for (int i = 0; i < number; i++) {
//            System.out.println("Podaj " + (i + 1) + " liczbę:");
//            sum += reader.nextInt();
//        }
        while (number-- > 0) {
            System.out.println("Podaj kolejną liczbę:");
            sum += sc.nextInt();
        }
        System.out.println("Suma podanych liczb: " + sum);
        sc.close();
    }
}
