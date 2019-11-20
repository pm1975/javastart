package task;

import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        Integer[] numbers = {1,22,43,57,14,6,2,845,15,456,25,46,75,356,159,126,3,456,8,35};

        System.out.println("Tablica przed sortowaniem: ");
        for (Integer n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("Tablica po sortowaniu: ");
        for (Integer n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2)*-1;
            }
        });
        System.out.println("Tablica po sortowaniu odwrotnym: ");
        for (Integer n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
