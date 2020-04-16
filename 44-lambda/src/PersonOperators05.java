import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Piotr on 2020-04-16
 */
public class PersonOperators05 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Kowalski", 42));
        people.add(new Person("Kasia", "Kruczkowska", 22));
        people.add(new Person("Piotr", "Adamiak", 15));
        people.add(new Person("Jan", "Zawadzki", 17));
        people.add(new Person("Krzysztof", "Wojtyniak", 16));
        people.add(new Person("Agnieszka", "Zagumna", 18));
        people.add(new Person("Basia", "Cyniczna", 28));

        System.out.println(">>> People");
        consumeList(people, (Person p) -> System.out.println(p));
        //operacje na people
        System.out.println("People age+1");
        consumeList(people, p -> {
            int currentAge = p.getAge();
            p.setAge(currentAge + 1);
            System.out.println(p);
        });
    }

    /*ta metoda jest sparametryzowana jakimś typem <T>
    drugi argument - wyrażenie lambda, które będzie miało być wywołane wraz z kolejnymi
    obiektami w tej liście. Interfejs Consumer. Wyrażenie lambda sparametryzowane też
    typem T.
     */
    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
