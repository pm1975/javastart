package task;

/**
 * Created by Piotr on 2019-11-14
 */
public class Factorial {
    public static void main(String[] args) {
        int factArg = 5;
        int multiply = factorial(factArg);
        System.out.println("Silnia " + factArg + " = " + multiply);
    }

    private static int factorial(int n) {
        return n > 1 ? n * factorial(n - 1) : 1;
    }
}
