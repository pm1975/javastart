package trymyself;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Piotr on 2020-01-27
 */
public class Lotto {
    private final static int NO_OF_NUMBERS = 49;
    public final static int MAX_NUMBERS = 6;

    private List<Integer> numbers = new ArrayList<>();

    public List<Integer> getLottoResult() {
        return lottoResult;
    }

    private List<Integer> lottoResult = new ArrayList<>();

    Lotto() {
        generate();
        randomize();
    }

    private void generate() {
        for (int i = 1; i < NO_OF_NUMBERS; i++) {
            numbers.add(i);
        }
    }

    private void randomize() {
        Collections.shuffle(numbers);
        lottoResult = numbers.subList(0, MAX_NUMBERS);
    }

    public int checkResult(List<Integer> userNumbers) {
        int found = 0;
        for (int i = 0; i < MAX_NUMBERS; i++) {
            if (lottoResult.contains(userNumbers.get(i))) {
                found++;
            }
        }
        return found;
    }

}

