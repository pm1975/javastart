import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class task {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> list = new ArrayList<>();
        generate(list,10, ()-> r.nextInt(1000));
        consume(list, x -> System.out.print(x + " "));
        devidedByTwo(list, x -> x % 2 == 0);
        System.out.println();
        consume(list, x -> System.out.print(x + " "));
    }

    public static <T> void generate(List<T> list, int toGenerate, Supplier<T> sup) {
        for (int i = 0; i < toGenerate; i++) {
            list.add(sup.get());
        }
    }

    public static <T> void consume(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    public static <T> void devidedByTwo(List<T> list, Predicate<T> predicate) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.test(next)) {
                iterator.remove();
            }
        }
    }
}
