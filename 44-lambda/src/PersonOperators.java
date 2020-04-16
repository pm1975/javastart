import java.util.ArrayList;
import java.util.List;

/**
 * Created by Piotr on 2020-04-16
 */
public class PersonOperators {
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
        printList(people);
        //Person p -> void [interface Customer]
        for (Person person : people) {
            int currentAge = person.getAge();
            person.setAge(currentAge + 1);
        }
        //operacje na people
        System.out.println("People age+1");
        printList(people);
    }

    private static void printList(List<Person> people) {
        //Person p -> void [interface Customer]
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
