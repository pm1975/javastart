/**
 * Created by Piotr on 2019-11-14
 */
public class NumberAdder {
    public static void main(String[] args) {
        int number = sum(5000000 );
        System.out.println(number);
    }

    private static int sum(int n) {
        if (n > 1) {
            System.out.println(n + "+" + "sum(" + (n - 1) + ")");
            return n + sum(n - 1);
        } else {
            return n;
        }
    }
}
