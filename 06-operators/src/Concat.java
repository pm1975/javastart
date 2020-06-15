/**
 * Created by Piotr on 2019-09-10
 */
public class Concat {
    //KONKATENACJA (łączenie stringów)
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + " " + s2);

        int x =2;
        int y = 3;
        int sum = x + y;
        System.out.println(x + " + " + y + " = " + sum);

        System.out.println(x + y + " to wyni sumowania");
        System.out.println("wynik sumowania to " + (x + y));

        System.out.println("Prawda to w programownaniu wartość " + true);

        System.out.println("Czy x jest większe od 0? " + (x > 0));

        System.out.println( 5 + 5 + " ABC"); //10 ABC
        System.out.println("ABC " + 5 + 5); //ABC 55
    }
}
