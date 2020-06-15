/**
 * Created by Piotr on 2019-09-10
 */
public class LogicalOperators {
    //OPERATORY LOGICZNE
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        boolean logic = true;
        System.out.println("X = " + x + ", Y = " + y);
//        System.out.println("Czy X jest mniejsze od 0 i (jednocześnie) Y jest większe od zera.");
//        System.out.println(x < 0);
//        System.out.println(y > 0);
//        System.out.println(x < 0 || y > 0);
//        System.out.println((x < 0 && y > 0));
        System.out.print("x < 10 && y < 11 ");
        System.out.println(x < 10 && y < 11);

        System.out.print("x < 10 && y < 10 ");
        System.out.println(x < 10 && y < 10);

        System.out.print("x < 10 || x < 10 ");
        System.out.println(x < 10 || x < 10);

        System.out.print("logic = " + logic);
        System.out.println(", !logic = " + !logic);

        System.out.print("Warunek złożony !(x < 10 && y < 10) ");
        System.out.println(!(x < 10 && y < 10));

    }
}
