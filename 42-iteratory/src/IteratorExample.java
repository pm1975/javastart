import java.util.*;

/**
 * Created by Piotr on 2020-01-22
 */
public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(3);
        list.add(21);
        list.add(150);
        list.add(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(450);
        numbers.add(30);
        numbers.add(210);
        numbers.add(1500);
        numbers.add(10);

        Iterator<Integer> iterator = numbers.iterator();
        //hasNext(), next(), remove()
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
