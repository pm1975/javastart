import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Piotr on 2020-04-21
 */
public class PersonOperators12_InterfacePredicate {
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
        List<Person> adults = filterAdults(people);
        consumeList(adults, p -> System.out.println(p));

        System.out.println(">>> Jan people");
        List<Person> janPeople = filterJan(people);
        consumeList(janPeople, p -> System.out.println(p));
    }

    private static List<Person> filterJan(List<Person> people) {
        List<Person> janPeople = new ArrayList<>();
        for (Person person : people) {
            //Jeżeli "Jan" to jest imię kolejnej osoby w liście
            if ("Jan".equals(person.getFirstName()))
                janPeople.add(person);
        }
        return janPeople;
    }

    private static List<Person> filterAdults(List<Person> people) {
        List<Person> adults = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() >= 18)
                adults.add(person);
        }
        return adults;
    }
    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
