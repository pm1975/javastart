import java.util.Set;

/**
 * Created by Piotr on 2019-11-29
 */
public class SetTest {
    public static void main(String[] args) {
        //zbiór niemodyfikowalny
        Set<String> names = Set.of("Marek", "Kasia", "Karol", "Basia");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
