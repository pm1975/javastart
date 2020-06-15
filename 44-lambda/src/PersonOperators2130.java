import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Piotr on 2020-04-23
 */
public class PersonOperators2130 {
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

        System.out.println(">>> FirstNames");
        List<String> firstNames = getFirstNames(people);
        consumeList(firstNames, str -> System.out.println(str));
    }

    private static <T, R> List<R> convertList(List<T> list, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for (T t : list) {
            R result = function.apply(t);
            resultList.add(result);
        }
        return resultList;
    }

    private static List<String> getFirstNames(List<Person> people) {
        List<String> firstNames = new ArrayList<>();
        for (Person person : people) {
            firstNames.add(person.getFirstName());
        }
        return firstNames;
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
