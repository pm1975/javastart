/**
 * Created by Piotr on 2019-09-10
 */
public class CompareOperators {
    //OPERATORY PORÓWNANIA
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println("Czy X jest większy od Y?");
        boolean isXGreaterThanY = x > y;
        System.out.println(isXGreaterThanY);

        boolean xEqualsY = x != y;
        System.out.println("Czy X jest różny od Y?");
        System.out.println(xEqualsY);
        System.out.println(!xEqualsY);

        boolean instance = "Kasia" instanceof  java.lang.String;
        System.out.println(instance); //"Kasia" jest typu String
    }
}
