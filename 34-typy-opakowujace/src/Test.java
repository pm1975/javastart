import org.w3c.dom.ls.LSOutput;

/**
 * Created by Piotr on 2019-11-15
 */
public class Test {
    public static void main(String[] args) {
        int number = 5;
        Integer number1 = new Integer(number);
        //algernatywnie
        Integer number2 = Integer.valueOf(number);
        String numberString = "5.5";
        double num = Double.parseDouble(numberString);
        double num2 = Double.valueOf(numberString);

        Integer value1 = Integer.valueOf(900);
        Integer value2 = Integer.valueOf(900);

        //porównanie referencji, a nie wartości!
        System.out.println(value1 == value2);
    }
}
