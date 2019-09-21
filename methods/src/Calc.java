/**
 * Created by Piotr on 2019-09-19
 */
public class Calc {

    //sygnatura metody
    //typ_zwracany (void -> pustka) nazwaMetody(opcjonalne_parametry) { return }

    int addTwoNumbers(int a, int b) {
        //a, b - zmienne lokalne
        int sum = a + b;
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    void addAndPrint(int x, int y) {
        int result = addTwoNumbers(x,y);
        System.out.println(result);
        //może się pojawić słówko return, żeby przerwać metodę
        return;
    }
}
