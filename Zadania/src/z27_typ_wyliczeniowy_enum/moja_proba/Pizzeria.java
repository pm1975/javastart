package z27_typ_wyliczeniowy_enum.moja_proba;

import z27_typ_wyliczeniowy_enum.moja_proba.Pizza;

import java.util.Scanner;

/**
 * Created by Piotr on 2019-10-31
 */
public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Dostępne pizze:");
        for (Pizza value : Pizza.values()) {
            System.out.println(value.getNumber() + " " + value.name() + " " + value.getDescription());
        }
        System.out.println("Wybierz pizze: ");
        Scanner sc = new Scanner(System.in);
        int userChoose = sc.nextInt();
        Pizza pizza = Pizza.fromNumber(userChoose);
        System.out.println("Wybrałeś pizze: " + pizza);
    }
}
