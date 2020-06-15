import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Piotr on 2019-10-04
 */
public class TwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); //wymuszenie lokalizacji Stany Zjednoczone, żeby używać kropki we wprowadzanych danych

        System.out.println("Podaj A: ");
        double a = input.nextDouble();
        System.out.println("Podaj B: ");
        double b = input.nextDouble();

        input.close();
        System.out.println("A + B = " + (a + b));
    }
}
