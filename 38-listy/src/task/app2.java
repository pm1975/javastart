package task;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Piotr on 2019-11-26
 */
public class app2 {
    public static void main(String[] args) {
        System.out.println("Sumowanie liczb.");
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        boolean tryAgain = true;
        do {
            try {
                list = rekurencja(sc, list);
                tryAgain = false;
            } catch (exitException e) {
                System.out.println(e.getMessage());
            }
        } while (tryAgain);
        double sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i) + " + ");
            sum += list.get(i);
        }
        String text = sb.toString().substring(0, sb.length() - 3);
        System.out.println(text + " = " + sum);
        sc.close();
    }

    static ArrayList<Double> rekurencja(Scanner sc, ArrayList<Double> list) throws exitException {
        String exit = null;
        System.out.println("Podaj liczbę (exit = koniec):");
        try {
            exit = sc.next();
            sc.nextLine();
            double number = Double.parseDouble(exit);
            list.add(number);
            rekurencja(sc, list);
        } catch (Exception e) {
            if (exit.equals("exit")) {
                return list;
            } else {
                throw new exitException("To nie jest cyfra.");
            }
        }
        return list;
    }

    static class exitException extends Exception {
        public exitException(String message) {
            super(message);
        }
    }

}
