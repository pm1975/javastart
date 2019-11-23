import java.util.Arrays;
import java.util.List;

/**
 * Created by Piotr on 2019-11-23
 */
public class ArrTest {
    public static void main(String[] args) {
        Integer[] ints = {5, 10, 15};
        List<Integer> lista = Arrays.asList(ints);
        for (Integer num : lista) {
            System.out.println(num);
        }

        List<Integer> list = List.of(5, 10, 15);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
