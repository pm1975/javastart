package src.zadanie.poprawnie;

import src.zadanie.UnknownOperatorException;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Piotr on 2019-11-05
 */
public class CalcApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        double a = 0;
        double b = 0;
        String operator = null;

        boolean readComplete = false;
        while (!readComplete) {
            try {
                System.out.println("Podaj pierwszą liczbę: ");
                a = input.nextDouble();
                input.nextLine();
                System.out.println("Podaj operator arytmetyczny (+,-,*,/):");
                operator = input.nextLine();
                System.out.println("Podaj drugą liczbę:");
                b = input.nextDouble();
                readComplete = true;
            } catch (Exception e) {
                System.err.println("Wprowadzono niepoprawne dane, zacznij jeszcze raz");
                input.nextLine();
            }
        }

        Calculator calc = new Calculator();
        double result = 0;
        boolean calculationComplete = false;
        try {
            result = calc.calculate(a,b,operator);
            calculationComplete = true;
        } catch (UnknownOperatorException e) {
            System.err.println(e.getMessage());
        }

        if (calculationComplete) {
            System.out.println(a + operator + b + "=" + result);
        } else {
            System.out.println("Nie można było obliczyć wyrażenia " + a + operator + b);
        }

        input.close();
    }
}
