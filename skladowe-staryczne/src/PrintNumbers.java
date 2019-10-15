import java.util.Scanner;

/**
 * Created by Piotr on 2019-10-15
 */
public class PrintNumbers {
    private static final int EXIT = 0;

    private static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start, end;
        do {
            System.out.println("Pierwsza liczba:");
            start = input.nextInt();
            System.out.println("Druga liczba:");
            end = input.nextInt();
            printNumbers(start, end);

            System.out.println("Koniec programu, wprowadź " + EXIT);
            System.out.println("Kontynuj, wprowadź wartość inną od " + EXIT);
        } while (input.nextInt() != EXIT);

        input.close();
    }
}
