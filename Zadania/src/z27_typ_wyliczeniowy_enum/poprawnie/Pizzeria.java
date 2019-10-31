package z27_typ_wyliczeniowy_enum.poprawnie;

import java.util.Scanner;

/**
 * Created by Piotr on 2019-10-31
 */
public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Dostępne pizze:");
        for (Pizza p : Pizza.values()) {
            System.out.println(p);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Jaką pizzę wybierasz?");
        Pizza pizza = Pizza.valueOf(input.nextLine().toUpperCase());

        System.out.println("Dziękujemy za zamówienie pizzy " + pizza.name());
        input.close();
    }
}
