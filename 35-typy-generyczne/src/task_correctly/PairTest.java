package task_correctly;

/**
 * Created by Piotr on 2019-11-16
 */
public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Ania", 1987);
        Pair<Double, Double> p2 = new Pair<>(20.5, 31.7);
        Pair<String, String> p3 = new Pair<>("Jan", "Kowalski");

        printPair(p1);
        printPair(p2);
        printPair(p3);
    }

    static <T, V> void printPair(Pair<T, V> pair) {
        System.out.println("<" + pair.getT() + " ; " + pair.getV() + ">");
    }
}
