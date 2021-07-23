package task2;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int number = drawer();
        System.out.println("Wylosowana liczba: " + number);
        biggerSmaller5000(number);
        evenOrOdd(number);
        completeWith4Digits(number);
    }

    static int drawer() {
        Random generator = new Random();
        return generator.nextInt(10000);
    }

    static void biggerSmaller5000(int number) {
        if (number < 5000) {
            System.out.println(number + " jest mniejsza od 5000");
        } else if (number == 5000) {
            System.out.println(number + " jest równa 5000");
        } else {
            System.out.println(number + " jest większa od 5000");
        }
    }

    static void evenOrOdd(int number)
    {
        if (number % 2 == 0) {
            System.out.println(number + " jest liczbą parzystą");
        } else {
            System.out.println(number + " jest liczbą nieparzystą");
        }
    }

    private static void completeWith4Digits(int number) {
        String replace = String.format("%-4s", number).replace(' ', '0');
        System.out.println("Uzupełniona do 4 cyfr: " + replace);
    }
}
