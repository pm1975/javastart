package task;

/**
 * Created by Piotr on 2019-11-16
 */
public class TestApp {
    public static void main(String[] args) {
        Pair<String, Integer> nameHeight = new Pair<>();
        nameHeight.setVariable1("Piotrek");
        nameHeight.setVariable2(175);

        Pair<Double, String> weightLastName = new Pair<>();
        weightLastName.setVariable1(84.5);
        weightLastName.setVariable2("Mierniczak");

        Pair<Integer, Double> childrensSalary = new Pair<>();
        childrensSalary.setVariable1(3);
        childrensSalary.setVariable2(4410.5);

        printPair(nameHeight.getVariable2(), weightLastName.getVariable2());
    }

    public static <T, V> void printPair(T variable1, V variable2) {
        System.out.println(variable1 + " " + variable2);
    }
}
