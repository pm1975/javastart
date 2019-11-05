package zadanie_poprawnie;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Piotr on 2019-11-05
 */
public class ShapeCalculator {
    private Scanner sc = new Scanner(System.in);

    public ShapeCalculator() {
        sc.useLocale(Locale.US);
    }

    public void closeScanner() {
        sc.close();
    }

    public Rectangle readRectangleData() throws InputMismatchException {
        System.out.println("Podaj informację o prostokącie:");
        System.out.println("Podaj długość boku A: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj długość boku B: ");
        double b = sc.nextDouble();
        sc.nextLine();

        return new Rectangle(a, b);
    }

    public Circle readCircleData() throws InputMismatchException {
        System.out.println("Podaj informacje o kole:");
        System.out.println("Podaj promień koła:");
        double r = sc.nextDouble();
        sc.nextLine();

        return new Circle(r);
    }

    public Triangle readTriangleData() throws InputMismatchException {
        System.out.println("Podaj informację o trójkącie:");
        System.out.println("Podaj długość boku A:");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj długość boku B:");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj długość boku C:");
        double c = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj wysokość opadającą na bok A:");
        double h = sc.nextDouble();
        sc.nextLine();

        return new Triangle(a, b, c, h);
    }

    public Shape createShape() throws NoSuchElementException, InputMismatchException {
        try {
            int shapeType = sc.nextInt();
            sc.nextLine();
            switch (shapeType) {
                case Shape.RECTANGLE:
                    return readRectangleData();
                case Shape.CIRCLE:
                    return readCircleData();
                case Shape.TRIANGLE:
                    return readTriangleData();
                default:
                    throw new NoSuchElementException();
            }
        } catch (InputMismatchException e) {
            sc.nextLine();
            throw e;
        }
    }
}
