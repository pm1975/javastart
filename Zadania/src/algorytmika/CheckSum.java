package algorytmika;

import java.util.Scanner;

/**
 * Created by Piotr on 2019-10-19
 */
public class CheckSum {
    public static void main(String[] args) {
        int sum = getSum();
        printOddOrEven(sum);
    }

    private static void printOddOrEven(int sum) {
        int mod = sum % 2;
        if (mod == 0) {
            System.out.println("parzysta");
        } else {
            System.out.println("nieparzysta");
        }
    }

    private static int getSum() {
        int sum = 0;
        int next = 0;
        Scanner input = new Scanner(System.in);
        while ((next = input.nextInt()) <= 100) {
            sum += next;
        }
        return sum;
    }
}
