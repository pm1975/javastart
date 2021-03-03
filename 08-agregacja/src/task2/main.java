package task2;

/**
 * Created by piotrek on 03/03/2021
 */
public class main {
    public static void main(String[] args) {
        Auction auction1 = new Auction();
        auction1.title = "Xbox One";
        auction1.description = "Konsola dla wymagających graczy";
        auction1.price = 999.99;
        User user1 = new User();
        user1.firstName = "Jan";
        user1.lastName = "Kowalski";
        auction1.seller = user1;
        Address address1 = new Address();
        address1.city = "Wrocław";
        address1.postalCode = "50-500";
        address1.street = "Kościuszki";
        address1.homeNo = "24A";
        address1.flatNo = "21";
        user1.address = address1;

        Auction auction2 = new Auction();
        auction2.title = "Samsung S20";
        auction2.description = "Niesamowity telefon z trzema obiektywami";
        auction2.price = 3999;
        User user2 = new User();
        user2.firstName = "Justyna";
        user2.lastName = "Adamczyk";
        auction2.seller = user2;

        System.out.println("Aukcja 1: " + auction1.title + ", " + auction1.description);
        System.out.println("Wystawił: " + auction1.seller.lastName);
        System.out.println("Aukcja 2: " + auction2.title + ", " + auction2.description);
        System.out.println("Wystawił: " + auction2.seller.lastName);
    }
}
