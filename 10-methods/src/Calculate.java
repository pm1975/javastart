import org.w3c.dom.ls.LSOutput;

/**
 * Created by Piotr on 2019-09-23
 */
public class Calculate {

    public static void main(String[] args) {

        double a = 5.2, b = 3.5;
        Calculator calculator = new Calculator();
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + calculator.add(a, b));
        System.out.println("a - b = " + calculator.subtract(a, b));
        System.out.println("a * b = " + calculator.multiply(a, b));
        System.out.println("a / b = " + calculator.divide(a, b));
    }
}
