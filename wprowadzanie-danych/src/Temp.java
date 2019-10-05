import java.util.Scanner;

/**
 * Created by Piotr on 2019-10-04
 */
class Temp {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        // do word zostanie przypisany znak nowej linii, który wciąż będzie w buforze
        String word = sc.nextLine();
        // po wczytaniu liczby nastąpi od razu wyświetlenie wartości
        System.out.println(number);
        System.out.println(word);

        sc.close();
    }
}