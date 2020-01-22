import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoverException {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kasia");
        names.add("Basia");
        names.add("Kajtek");
        names.add("Wojtek");
        names.add("Maniek");

        // petla ok, bo nie korzystamy z iteratora
        System.out.println(">>> Petla 1");
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
            if (name.equals("Basia")) {
                names.remove(name);
                i--;
            }
        }

        Iterator<String> namesIterator = names.iterator();
        System.out.println(">>> Petla 2");
        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
            if (name.equals("Kasia")) {
                //blad - iterujemy po kolekcji za pomoc iteratora, a usuwamy
                //obiekt metodoa remove() bezposrednio z kolekcji
                //names.remove(name);
                namesIterator.remove();
            }
        }

        System.out.println(">>> Petla 3");
        for (String name : names) {
            System.out.println(name);
            if (name.equals("Maniek")) {
                // blad - iterujemy po kolekcji za pomoca niejawnego iteratora
                // petli for-each, a usuwamy
                // obiekt metoda remove() bezposrednio z kolekcji
                names.remove(name);
            }
        }
    }
}
