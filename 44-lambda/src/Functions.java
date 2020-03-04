import java.util.function.Consumer;
import java.util.function.Function;

/**
Wyrażenia lambda są odzwierciedleniem takich funkcji:
f(x) = x*x
f(2) = 2*2 = 4

Argument wyrażenia lambda | operator w postaci strzałki |
ciało wyrażenia lambda, czyli operacje które chcemy wykonać
(int x) -> x*x

W wyrażeniach lambda, niektóre części można skracać, niektóre rozbudowywać
(int x) -> return x*x
(x) -> x*x
x -> x*x
x -> {
if (x > 0) return x*x;
else return 0;
}

 Interfejsy funkcyjne: posiadają jedną metodę abstrakcyjną.
 np. Consumer<T>, Function<T,R>, Predicate<T>, Supplier<T>
Między nawiasami ostrymi: typy generyczne.
 Cunsomer - jedna metoda abstrakcyjna
 */
public class Functions {
    public static void main(String[] args) {
        //(int x) -> return x*x
        //T t ->            interfejs Consumer
        //T t -> return R   interfejs Function
        //normalnie
        String original = "   WIELKI NAPIS   ";
        String changed = original.toLowerCase().trim();
        System.out.println(changed);
        System.out.println(original);
        //lambda
        Function<String,String> func = s -> s.toLowerCase().trim();
        changed = func.apply(original);
        Consumer<String> print3Times = s -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(s);
            }
        };
        print3Times.accept(changed);

    }
}
