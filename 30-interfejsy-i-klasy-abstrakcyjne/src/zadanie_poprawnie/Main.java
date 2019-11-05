package zadanie_poprawnie;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

/**
 * Created by Piotr on 2019-11-05
 */
public class Main {
    public static void main(String[] args) {
        ShapeCalculator shapeCalc = new ShapeCalculator();
        Shape shape = null;

        boolean readComplete = false;
        while (!readComplete) {
            try {
                printOptions();
                shape = shapeCalc.createShape();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadziłeś dane o złym formacie, spróbuj ponownie");
            } catch (NoSuchElementException e) {
                System.out.println("Wybrany indentyfikator kształtu jest niepoprawny, spróbuj ponownie");
            }
        }
        System.out.println(shape);

        shapeCalc.closeScanner();
    }

    private static void printOptions() {
        System.out.println("Wybierz figurę, dla której chcesz obliczyć pole i obwód:");
        System.out.println(Shape.RECTANGLE + " - prostokąt");
        System.out.println(Shape.CIRCLE + " - koło");
        System.out.println(Shape.TRIANGLE + " - trójkąt");
    }
}
