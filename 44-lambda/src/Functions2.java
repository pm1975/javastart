import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by Piotr on 2020-02-15
 */
public class Functions2 {
    public static void main(String[] args) {
        String original = "   WIELKI NAPIS   ";
        Function<String, String> func1 = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toLowerCase().trim();
            }
        };
        //Od javy 8 wykorzystanie metod anonimowych zmalało prawie do zera,
        //bo w większości przypadków da się je zastąpić przy pomocy wyrażeń lambda
        Function<String, String> func2 = (String s) -> s.toLowerCase().trim();

        //z typów parametrów wynika jaki będziemy mieć wynik i możemy to jeszcze bardziej uprościć
        //nie musimy podawać typu parametru
        Function<String, String> func = s -> s.toLowerCase().trim();
        String changed = func.apply(original);

        //print3Times(changed);
        Consumer<String> print3Times = s -> { for (int i = 0; i < 3; i++) System.out.println(s); };
        print3Times.accept(changed);

        int personAge = 19;
        //boolean check1 = checkIfAdult(personAge);
        //Predicate<Integer> checkIfAdult = (Integer age) -> age >= 18;
        //na podstawie typu jaki podaliśmy w typie generycznym, kompulator jest w stanie wywnioskować,
        //co się tutaj będzie działo.

        Predicate<Integer> checkIfAdult = age -> age >= 18;
        boolean check1 = checkIfAdult.test(personAge);

        String[] firstNames = {"Jan", "Karol", "Piotr"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski"};
        int[] ages = {22, 33, 44};
        Random random = new Random();

        //definiujemy Supplier'a, który dostarczy nam obiekt typu Person.
        //Nazwiemy go randomPersonGenerator
        Supplier<Person> randomPersonGenerator = () -> {
            //definiujemy dodatkową zmieną String
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName, lastName, age);
        };

        //() -> return Person
        System.out.println(randomPersonGenerator.get());
        System.out.println(randomPersonGenerator.get());
        System.out.println(randomPersonGenerator.get());
        System.out.println(randomPersonGenerator.get());
        System.out.println(randomPersonGenerator.get());
        System.out.println(randomPersonGenerator.get());
    }

}


