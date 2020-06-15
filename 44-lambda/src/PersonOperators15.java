import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by Piotr on 2020-04-21
 */
public class PersonOperators15 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Kowalski", 42));
        people.add(new Person("Kasia", "Kruczkowska", 22));
        people.add(new Person("Piotr", "Adamiak", 15));
        people.add(new Person("Jan", "Zawadzki", 17));
        people.add(new Person("Krzysztof", "Wojtyniak", 16));
        people.add(new Person("Agnieszka", "Zagumna", 18));
        people.add(new Person("Basia", "Cyniczna", 28));

        System.out.println(">>> Adults");
        List<Person> adults = filterByPredicate(people, person -> person.getAge() >= 18);
        consumeList(adults, person -> System.out.println(person));

        System.out.println(">>> Jan people");
        List<Person> janPeople = filterByPredicate(people, person -> "Jan".equals(person.getFirstName()));
        consumeList(janPeople, person -> System.out.println(person));
    }

    //Person p -> boolean
    private static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t))
                result.add(t);
        }
        return result;
    }
    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
