/**
 * Created by Piotr on 2019-09-10
 */
public class MathOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 4;

        int sum = x + y; //addition
        int sub = x - y; //subtraction
        int multi = x * y; //multiplication
        double div = x / y; //division integer - dzielenie całkowitoliczbowe
        int mod = x % y; //rest of division

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(mod);

//        y = y * 5;
        y += 5;
        System.out.println("Nowy Y: " + y);
    }
}
