package taskonceagain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Piotr on 2020-01-29
 */
public class LottoGame {
    public static void main(String[] args) {
        System.out.println("Witam w Lotto.");
        Lotto lotto = new Lotto();
        List<Integer> userNumbers = getNumbersFromUser();
        System.out.println("Twoje wylosowane liczby: " + userNumbers);
        System.out.println("Liczby lotto: " + lotto.getLottoNumbers());
        System.out.println("Trafiłeś: " + lotto.checkResult(userNumbers));
    }

    private static List<Integer> getNumbersFromUser() {
        List<Integer> userNubers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Lotto.MAX_NUMBERS; i++) {
            System.out.println("Podaj liczbę: ");
            userNubers.add(sc.nextInt());
        }
        return userNubers;
    }

}
