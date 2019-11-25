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
                    if (exit != "exit") {
                        double number = Double.parseDouble(exit);
                        list.add(number);
                    }
                } catch (Exception e) {
                    System.out.println("To nie jest cyfra.");
                }
        } while (exit != "exit");

        double sum = 0;
        if (list.size() > 0) {
            System.out.println(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.println(" + " + i);
        }
        System.out.println(" = " + sum);
    }
}
