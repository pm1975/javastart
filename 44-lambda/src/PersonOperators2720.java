import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by Piotr on 2020-04-23
 */
public class PersonOperators2720 {
    public static void main(String[] args) {
        String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames = {"Abacki", "Kowalski", "Zawadzki", "Korzeniowski"};
        int[] ages = {11, 22, 33, 44, 55};
        Random random = new Random();
        Supplier<Person> supplier = () -> {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName, lastName, age);
        };

        List<Person> people = generateRandomList(5, supplier);

        System.out.println(">>> People");
        consumeList(people, (Person p) -> System.out.println(p));
        //operacje na people
        System.out.println(">>> People age+1");
        consumeList(people, person -> person.setAge(person.getAge() + 1));
        consumeList(people, p -> System.out.println(p));

        System.out.println(">>> Adults");
        List<Person> adults = filterByPredicate(people, person -> person.getAge() >= 18);
        consumeList(adults, person -> System.out.println(person));

        System.out.println(">>> Jan people");
        List<Person> janPeople = filterByPredicate(people, person -> "Jan".equals(person.getFirstName()));
        consumeList(janPeople, person -> System.out.println(person));

        System.out.println(">>> FirstNames");
        List<String> firstNames2 = convertList(people, person -> person.getFirstName());
        consumeList(firstNames2, str -> System.out.println(str));
    }

    private static <T, R> List<R> convertList(List<T> list, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for (T t : list) {
            R result = function.apply(t);
            resultList.add(result);
        }
        return resultList;
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

    private static <T> List<T> generateRandomList(int elements, Supplier<T> supplier) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            result.add(supplier.get());
        }
        return result;
    }
}
