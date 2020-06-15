/**
 * Created by Piotr on 2019-09-30
 */
public class IfTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;

        if (a > b) {
            System.out.println("A > B");
        } else if (b > c) {
            System.out.println("B > C");
        } else if (c > a) {
            System.out.println("C > A");
        }

        if (a > b) {
            System.out.println("(2) A > B");
        }
        if (b > c) {
            System.out.println("(2) B > C");
        }
        if (c > a) {
            System.out.println("(2) C > A");
        }

        //        int a = 40;
//        //koniunkcja i alternatywa logiczna
//        boolean aPositive = a > 0;
//        boolean aEven = a % 2 == 0;
//
//        //koniunkcja
//        if (aPositive && aEven) {
//            System.out.println("A jest liczbą parzystą i dodatnią.");
//        }
//
//        //alternatywa logiczna
//        if (aPositive || aEven) {
//            System.out.println("A jest liczbą parzystą lub dodatnią.");
//        }
    }
}
