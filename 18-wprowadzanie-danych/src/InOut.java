import java.util.Scanner;

/**
 * Created by Piotr on 2019-10-04
 */
public class InOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wprowadź swoje imię: ");
        String firstName = input.nextLine();
        System.out.println("Wprowadź swoje nazwisko: ");
        String lastName = input.nextLine();
        System.out.println("Podaj swój wiek: ");
        int age = input.nextInt();

        input.close();

        System.out.println("Cześć " + firstName + " " + lastName);
        System.out.println("Masz już " + age + ", starość nie radość! :)");
    }
}
