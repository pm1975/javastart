package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Piotr on 2019-11-23
 */
public class app {
    public static void main(String[] args) {
        System.out.println("Sumowanie liczb.");
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        String exit = null;
        do {
            System.out.println("Podaj liczbę (exit = koniec):");
                try {
                    exit = sc.next();
                    sc.nextLine();
                    String ex = "exit";
                    if (!exit.equals("exit")) {
                        double number = Double.parseDouble(exit);
                        list.add(number);
                    }
                } catch (Exception e) {
                    System.out.println("To nie jest cyfra.");
                }
        } while (!exit.equals("exit"));

        double sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
           sb.append(list.get(i) + " + ");
           sum += list.get(i);
        }
        String text = sb.toString().substring(0, sb.length() - 3);
        System.out.println(text + " = " + sum);
    }

}
