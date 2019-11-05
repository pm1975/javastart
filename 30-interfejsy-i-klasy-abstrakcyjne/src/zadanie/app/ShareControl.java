package zadanie.app;

import zadanie.exception.NoSuchOptionException;
import zadanie.io.ConsolePrinter;
import zadanie.io.DataReader;
import zadanie.model.Circle;
import zadanie.model.Rectangle;
import zadanie.model.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Piotr on 2019-11-05
 */
public class ShareControl {
    private ConsolePrinter printer = new ConsolePrinter();
    private DataReader dataReader = new DataReader();
    Scanner input = new Scanner(System.in);

    void controlLoop() {
        Option option;

        do {
            printOptions();
            option = getOption();
            double result = 0;
            switch (option) {
                case EXIT:
                    break;
                case RECTANGLE_AREA:
                    result = calculateRectangle(false);
                    break;
                case RECTANGLE_PERIMETER:
                    result = calculateRectangle(true);
                    break;
                case CIRCLE_AREA:
                    result = calculateCircle(false);
                    break;
                case CIRCLE_PERIMETER:
                    result = calculateCircle(true);
                    break;
                case TRIANGLE_AREA:
                    result = calculateTriangle(false);
                    break;
                case TRIANGLE_PERIMETER:
                    result = calculateTriangle(true);
                    break;
            }
            printer.printLine(option.getDescription() + " " + result);
        } while (option != Option.EXIT);
    }

    private Option getOption() {
        boolean optionOk = false;
        Option option = null;
        while (!optionOk) {
            try {
                option = Option.createFromInt(dataReader.getInt());
                optionOk = true;
            } catch (NoSuchOptionException e) {
                printer.printLine(e.getMessage() + ", podaj ponownie:");
            } catch (InputMismatchException ignored) {
                printer.printLine("Wprowadzono wartość, która nie jest liczbą, podaj ponownie:");
            }
        }
        return option;
    }

    private void printOptions() {
        printer.printLine("Wybierz opcję:");
        for (Option option : Option.values()) {
            printer.printLine(option.toString());
        }
    }

    private double calculateRectangle(boolean perimeter) {
        double a = 0;
        double b = 0;
        boolean readComplete = false;
        while (!readComplete) {
            try {
                printer.printLine("Podaj bok a: ");
                a = input.nextDouble();
                printer.printLine("Podaj bok b:");
                b = input.nextDouble();
                readComplete = true;
            } catch (Exception e) {
                printer.printLine("Wprowadzono niepoprawne dane, zacznij jeszcze raz");
                input.nextLine();
            }
        }
        Rectangle rectangle = new Rectangle(a, b);
        if (perimeter)
            return rectangle.calculatePerimeter();
        else
            return rectangle.calculateArea();
    }

    private double calculateCircle(boolean perimeter) {
        double r = 0;
        boolean readComplete = false;
        while (!readComplete) {
            try {
                printer.printLine("Podaj promień r: ");
                r = input.nextDouble();
                readComplete = true;
            } catch (Exception e) {
                printer.printLine("Wprowadzono niepoprawne dane, zacznij jeszcze raz");
                input.nextLine();
            }
        }
        Circle circle = new Circle(r);
        if (perimeter)
            return circle.calculatePerimeter();
        else
            return circle.calculateArea();
    }

    private double calculateTriangle(boolean perimeter) {
        double a = 0, b = 0, c = 0, h = 0;
        boolean readComplete = false;
        while (!readComplete) {
            try {
                printer.printLine("Podaj bok a: ");
                a = input.nextDouble();
                if (perimeter)
                {
                    printer.printLine("Podaj bok b: ");
                    b = input.nextDouble();
                    printer.printLine("Podaj bok c: ");
                    c = input.nextDouble();
                } else {
                    printer.printLine("Podaj wysokość h: ");
                    h = input.nextDouble();
                }
                readComplete = true;
            } catch (Exception e) {
                printer.printLine("Wprowadzono niepoprawne dane, zacznij jeszcze raz");
                input.nextLine();
            }
        }
        if (perimeter)
        {
            Triangle triangle = new Triangle(a, b, c);
            return triangle.calculatePerimeter();
        } else {
            Triangle triangle = new Triangle(a, h);
            return triangle.calculateArea();
        }
    }
}
