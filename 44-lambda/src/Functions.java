import java.util.function.Function;

/**
 * Created by Piotr on 2020-02-01
 */
public class Functions {
    public static void main(String[] args) {
        String original = "   WIELKI NAPIS   ";
        Function<String,String> funcLambda = s -> s.toLowerCase().trim();
        String changed2 = funcLambda.apply(original);
        System.out.println(changed2);
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