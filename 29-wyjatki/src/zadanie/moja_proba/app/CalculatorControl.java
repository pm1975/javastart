package src.zadanie.moja_proba.app;

import src.zadanie.UnknownOperatorException;
import src.zadanie.moja_proba.app.Option;
import src.zadanie.moja_proba.io.DataReader;

/**
 * Created by Piotr on 2019-11-04
 */
public class CalculatorControl {
    private DataReader dataReader = new DataReader();

    void controlLoop() {
        Option option;
        double value1 = 0.0, value2 = 0.0;
        boolean error = true;
        do {
            do {
                try {
                    System.out.println("Podaj pierwszą liczbę:");
                    value1 = dataReader.getDouble();
                    error = false;
                } catch (Exception e) {
                    System.err.println("To nie jest liczba.");
                    dataReader.nextLine();
                }
            } while (error);
            option = null;
            do {
                printOptions();
                try {
                    option = Option.fromChar(dataReader.getChar());
                } catch (UnknownOperatorException e) {
                    System.err.println(e.getMessage());
                }
            } while (option == null);
            error = true;
            do {
                try {
                    System.out.println("Podaj drugą liczbę:");
                    value2 = dataReader.getDouble();
                    error = false;
                } catch (Exception e) {
                    System.err.println("To nie jest liczba.");
                    dataReader.nextLine();
                }
            } while (error);
            switch (option) {
                case ADD:
                    System.out.println(value1 + "+" + value2 + "=" + (value1+value2));
                    break;
                case MINUS:
                    System.out.println(value1 + "-" + value2 + "=" + (value1-value2));
                    break;
                case MULTIPLY:
                    System.out.println(value1 + "*" + value2 + "=" + (value1*value2));
                    break;
                case DIVIDE:
                    if (value2 != 0)
                        System.out.println(value1 + "/" + value2 + "=" + (value1/value2));
                    else
                        System.err.println("Nie dzieli się przez zero!");
                    break;
                case EXIT:
                    break;
            }
        } while (option != Option.EXIT);

    }
    private void printOptions() {
        System.out.println("Wybierz działanie:");
        for (Option value : Option.values()) {
            System.out.println(value);
        }
    }
}
