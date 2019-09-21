/**
 * Created by Piotr on 2019-09-19
 */
public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calc();
        double result = calc.add(2.5, 7.5);
        System.out.println(result);
        calc.addAndPrint(3,1);

        result = calc.addTwoNumbers(10, 40);
        System.out.println(result);
        System.out.println(calc.addTwoNumbers(33,164));
        calc.addAndPrint(5, 10);

    }
}
