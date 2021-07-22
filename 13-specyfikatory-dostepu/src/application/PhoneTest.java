package application;

import logic.Charger;
import model.Telephone;

public class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        System.out.println(telephone);
        Charger charger = new Charger(telephone);
        for (int i = 0; i < 5; i++) {
            charger.Charging();
        }
        System.out.println("Telefon po naładowaniu");
        System.out.println(telephone);
    }
}
