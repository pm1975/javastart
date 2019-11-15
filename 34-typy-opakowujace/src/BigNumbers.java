import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Piotr on 2019-11-15
 */
public class BigNumbers {
    public static void main(String[] args) {
        double a = 0.7;
        double b = 0.3;
        System.out.println("a - b = " + (a - b));

        BigDecimal aBig = BigDecimal.valueOf(a);
        BigDecimal bBig = BigDecimal.valueOf(b);
        System.out.println("aBig - bBig = " + aBig.subtract(bBig));

        /**
         * add() - dodawanie
         * subtract() - odejmowanie
         * multiply() - mnożenie
         * divide() - dzielenie
         */

        BigInteger big = new BigInteger("1234567891012333456789");
        big = big.multiply(BigInteger.valueOf(123456789));
        System.out.println(big);
    }
}
