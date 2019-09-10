/**
 * Created by Piotr on 2019-09-10
 */
public class MathOperators {
    public static void main(String[] args) {
        int x = 22;
        int y = 2;

        int sum = x + y;

        System.out.println(sum);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

//        y = y * 5;
        y += 5;
        System.out.println("Nowy Y: " + y);
    }
}
