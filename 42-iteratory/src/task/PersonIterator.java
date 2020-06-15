package task;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Piotr on 2020-01-23
 */
public class PersonIterator {
    public static void main(String[] args) {
        Map<String, Person> people = new TreeMap<>();

        people.put("Kowalski", new Person("Jak", "Kowalski", 35));
        people.put("Adamski", new Person("Bolek", "Adamski", 50));
        people.put("Wojciechowski", new Person("Lolek", "Wojciechowski", 40));
        people.put("Duczmal", new Person("Wojciech", "Duczmal", 20));
        people.put("Milus", new Person("Anna", "Milus", 35));
        people.put("Cejrowski", new Person("Krystian", "Cejrowski", 35));

        Collection<Person> values = people.values();
        Iterator<Person> iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
