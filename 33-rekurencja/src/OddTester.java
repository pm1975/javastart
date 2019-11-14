/**
 * Created by Piotr on 2019-11-14
 * odd = nieparzysta
 * even = parzysta
 */
public class OddTester {
    public static void main(String[] args) {
        checkNumber(10);
        checkNumber(11);
    }

    private static void checkNumber(int n) {
        String check = n % 2 == 0 ? "Parzysta" : "Nieparzysta";
        System.out.println(n + " " + check);
    }
}
