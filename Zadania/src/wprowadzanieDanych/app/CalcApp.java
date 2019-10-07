package wprowadzanieDanych.app;

import wprowadzanieDanych.calc.Calculator;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Piotr on 2019-10-05
 */
public class CalcApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Kalkulator.");
        System.out.println("Podaj pierwszą liczbę i zatwierdź enterem:");
        double a = input.nextDouble();
        input.nextLine();
        System.out.println("Podaj działanie matematyczne (+, -, /, *)");
        String operator = input.nextLine();
        System.out.println("Podaj drugą liczbę:");
        double b = input.nextDouble();

        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, operator);
        System.out.println(a + operator + b + "=" + result);

        input.close();
    }
}
