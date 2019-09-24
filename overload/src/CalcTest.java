/**
 * Created by Piotr on 2019-09-24
 */
public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 30, b = 20, c = 10;
        System.out.println("A = " + a + ", B = " + b + ", C = " + c);
        System.out.println("A + B = " + calculator.add(5, 10));
        System.out.println("A + B + C = " + calculator.add(5, 10, 15));
        System.out.println("A - B  = " + calculator.subtract(5,10));
        System.out.println("A - B - C = " + calculator.subtract(5,10, 15));
    }
}
