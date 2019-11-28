package task_correct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Piotr on 2019-11-28
 */
public class SumNumbers {
    public static final String EXIT = "exit";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        fillList(numbers);
        printData(numbers);
    }

    //metoda rekurencyjna do wczytywania danych
    private static void fillList(List<Double> list) {
        System.out.println("Podaj kolejną liczbę (lub wpisz \"exit\"): ");

        String input = sc.nextLine();
        if (input.equals(SumNumbers.EXIT))
            return;

        try {
            Double num = Double.valueOf(input);
            list.add(num);
        } catch (NumberFormatException e) {
            System.err.println("Liczba w niepoprawnym formacie");
        }

        fillList(list);
    }

    // metoda do wyświetlania danych
    private static void printData(List<Double> list) {
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            double sum = 0;
            for (Double d : list) {
                sb.append(d);
                sb.append('+');
                sum += d;
            }
            //zamień ostatni znak '+' na '='
            sb.replace(sb.length() - 1, sb.length(), "=");
            sb.append(sum);
            System.out.println(sb.toString());
        }
    }
}
