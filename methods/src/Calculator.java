/**
 * Created by Piotr on 2019-09-23
 */
public class Calculator {
    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        if (b != 0) return a / b;
        else return 0;
    }
}
