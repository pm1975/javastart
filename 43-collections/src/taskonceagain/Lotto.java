package taskonceagain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Piotr on 2020-01-29
 */
public class Lotto {
    private static final int NO_OF_NUMBERS = 49;
    public static final int MAX_NUMBERS = 6;
    private List<Integer> numbers = new ArrayList<>();
    private List<Integer> lottoNumbers = new ArrayList<>();

    Lotto() {
        generate();
        randomize();
    }

    public List<Integer> getLottoNumbers() {
        return lottoNumbers;
    }

    private void generate() {
        for (int i = 1; i <= NO_OF_NUMBERS; i++) {
            numbers.add(i);
        }
    }

    private void randomize() {
        Collections.shuffle(numbers);
        lottoNumbers = numbers.subList(0, 6);
    }

    public int checkResult(List<Integer> userNumbers) {
        int find = 0;
        for (int i = 0; i < MAX_NUMBERS; i++) {
            if (lottoNumbers.contains(userNumbers.get(i))) {
                find++;
            }
        }
        return find;
    }
}
