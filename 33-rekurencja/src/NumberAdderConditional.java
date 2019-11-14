/**
 * Created by Piotr on 2019-11-14
 *
 * Operator trójargumentowy
 *
 * warunek? wynik_jeśli_warunek_true : wynik_jeśli_warunek_false
 *
 */
public class NumberAdderConditional {
    public static void main(String[] args) {
        int number = sum(500);
        System.out.println(number);
    }

    private static int sum(int n) {
        return n > 1 ? n + sum(n - 1) : n;
    }
}
