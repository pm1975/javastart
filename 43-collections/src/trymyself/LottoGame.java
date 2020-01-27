package trymyself;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Piotr on 2020-01-27
 */
public class LottoGame {
    public static void main(String[] args) {
        System.out.println("Losowanie lotto.");
        Lotto lotto = new Lotto();
        List<Integer> userNumbers = getNumbersFromUser();
        int result = lotto.checkResult(userNumbers);
        System.out.println("Wylosowane liczby: " + lotto.getLottoResult());
        System.out.println("Twoje liczby: " + userNumbers);
        System.out.println("Trafiłeś: " + result);
    }

    private static List<Integer> getNumbersFromUser() {
        Scanner sc = new Scanner(System.in);
        List<Integer> userNumbers = new ArrayList<>();
        for (int i = 0; i < Lotto.MAX_NUMBERS; i++) {
            System.out.println("Podaj cyfrę:");
            int nextNumber = sc.nextInt();
            userNumbers.add(nextNumber);
        }
        return userNumbers;
    }
}
