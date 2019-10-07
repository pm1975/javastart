package wprowadzanieDanych.calc;

/**
 * Created by Piotr on 2019-10-05
 */
public class Calculator {

    public double calculate(double a, double b, String operator) {
        double result = 0.0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b > 0) {
                    result = a / b;
                    break;
                }
                else
                    System.out.println("Nie dzieli się przez zero!");
            default:
                System.out.println("Podany operator nie istnieje!");
        }
        return result;
    }
}
