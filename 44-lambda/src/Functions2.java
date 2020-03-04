import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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
        Consumer<String> print3Times = (String s) -> {
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        };
        print3Times.accept(changed);

        int personAge = 19;
        //boolean check1 = checkIfAdult(personAge);
        Predicate<Integer> checkIfAdult = age -> age >= 18;
        boolean check1 = checkIfAdult.test(personAge);

    }

    //int -> return boolean
    static boolean checkIfAdult(int age) {
        return age >=18;
    }
//    private static void print3Times(String changed) {
//        System.out.println(changed);
//        System.out.println(changed);
//        System.out.println(changed);
//    }
}


