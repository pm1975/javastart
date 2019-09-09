/**
 * Created by Piotr on 2019-09-06
 */
public class Variables {
    public static void main(String[] args) {
        String firstName = "Piotr";
        String lastName = "Mierniczak";
        final String pesel = "75082504874";
        int age = 44;
        double height = 174.9;

        System.out.print("Cześć ");
        System.out.print(firstName);
        System.out.print(" ");
        System.out.println(lastName);

        System.out.println("Oto kolka danych o Tobie:");
        System.out.print("Numer pesel: ");
        System.out.println(pesel);
        System.out.print("Wiek: ");
        System.out.println(age);
        System.out.println("Wzrost: " + height);
    }
}
