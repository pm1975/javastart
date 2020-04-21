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
        /* Jeżeli zapisujemy tutaj wyrażenie lambda, jako argument metody, musimy dodać dodatkowe okrągłe nawiasy
        (Person p). Ewentualnie, ponieważ lista jest sparametryzowana, to nie musimy podawać tutaj tego typu Person.
        Wystarczy, że zapiszemy krócej p.

        Wyrażenie lambda operuje na obiekcie typu Person, co wynika z tego, jaką listę tutaj przekazałem.
        Consumer - bieże obiekt typu T. Nie zwraca żadnego wyniku.
        */
        consumeList(people, (Person p) -> System.out.println(p));
        //operacje na people
        System.out.println(">>> People age+1");
        /*Zaleta programowania funkcyjnego nad programowaniem operatywnym, gdzie wszystko musimy zapisywać
          wiersz po wierszu co i jak chcemy zrobić
          W programowaniu funkcyjnym jeśli napiszemy sobie odpowiednio uogólniony kod, to wskazujemy tylko
          co chcemy zrobić
         */
        consumeList(people, person -> person.setAge(person.getAge() + 1));
        consumeList(people, p -> System.out.println(p));
    }

    /*Jeżeli chcemy podawać typ obiektowy dowolnego typu, dodajemy typ generyczny (T).
    Ta metoda jest sparametryzowana jakimś typem <T>.
    Jako drugi argument przekażemy wyrażenie lambda, które będzie miało być wywołane wraz z kolejnymi
    obiektami zapisanymi w tej liście. My chcemy wykorzystać interfejs Consumer.
    Tutaj będziemy mieli wyrażenie lambda też sparametryzowane typem T.
     */
    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
