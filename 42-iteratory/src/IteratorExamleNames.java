import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Piotr on 2020-01-22
 */
public class IteratorExamleNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kasia");
        names.add("Kasia");
        names.add("Basia");
        names.add("Basia");
        names.add("Basia");
        names.add("Kajtek");
        names.add("Wojtek");
        names.add("Maniek");

        System.out.println(">>> Pętla 1");
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
            if (name.equals("Basia")) {
                names.remove(name);
                i--;
            }
        }
        System.out.println(names);

        System.out.println(">>> Pętla 2");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
            if (name.equals("Kasia")) {
                iterator.remove();
            }
        }
        System.out.println(names);

        System.out.println(">>> Pętla 3");
        for (String name : names) {
            System.out.println(name);
            if (name.equals("Kasia")) {
                names.remove("Kasia");
            }
        }
    }
}
