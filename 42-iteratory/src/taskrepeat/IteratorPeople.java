package taskrepeat;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Piotr on 2020-01-24
 */
public class IteratorPeople {
    public static void main(String[] args) {
        Map<String, Person> people = new TreeMap<>();
        Person p1 = new Person("Jan", "Kowalski", 35);
        Person p2 = new Person("Karol", "Autustyński", 20);
        Person p3 = new Person("Alicja", "Żurek", 40);
        Person p4 = new Person("Celina", "Bolkowska", 22);
        Person p5 = new Person("Wiesław", "Maliński", 33);
        Person p6 = new Person("Danuta", "Lisowska", 25);

        people.put(p1.getLastName(), p1);
        people.put(p2.getLastName(), p2);
        people.put(p3.getLastName(), p3);
        people.put(p4.getLastName(), p4);
        people.put(p5.getLastName(), p5);
        people.put(p6.getLastName(), p6);

        Collection<Person> values = people.values();
        Iterator<Person> iterator = values.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
