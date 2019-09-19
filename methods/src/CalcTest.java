/**
 * Created by Piotr on 2019-09-19
 */
public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calc();
        double resutl = calc.add(2.5, 7.5);
        System.out.println(resutl);
        calc.addAndPrint(3,1);
    }
}
