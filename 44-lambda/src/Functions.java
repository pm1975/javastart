import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by Piotr on 2020-02-01
 */
public class Functions {
    public static void main(String[] args) {
        String original = "   WIELKI NAPIS   ";
        Function<String,String> func = s -> s.toLowerCase().trim();
        String changed = func.apply(original);
        Consumer<String> print3Times = s -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(s);
            }
        };
        print3Times.accept(changed);
        
        //T t ->
        //T t -> return R
    }
}
/*
f(x) = x*x
f(2) = 4
(int x) -> x*x
(int x) -> return x*x
x -> x*x
if (x > 0) return x*x;
else return 0;
 */