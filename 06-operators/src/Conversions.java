/**
 * Created by Piotr on 2019-09-10
 */
public class Conversions {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.8;
        int c = (int)b; //konwersja zawężająca
        System.out.println(c);

        double number1 = 10.987;
        int number2 = 5;

        //konwersja zawężająca (ang. narrowing)
        int narrowing = (int) number1;

        //konwersja rozszerzająca (ang. widening)
        double widening = (double) number2;
        System.out.println("Narrowing " + number1 + ": " + narrowing);
        System.out.println("Widening " + number2 + ": " + widening);
    }
}
