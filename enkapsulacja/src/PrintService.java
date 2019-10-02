/**
 * Created by Piotr on 2019-10-02
 */

class PrintService {
    void printSummary(Client client, double originalPrice, double discountPrice) {
        printWelcomeMessage(client);
        printPrices(originalPrice, discountPrice);
    }

    private void printWelcomeMessage(Client client) {
        String firstName = client.getFirstName();
        String lastName = client.getLastName();
        if (lastName == null) {
            System.out.println("Witaj " + firstName);
        } else if (firstName != null && lastName != null) {
            System.out.println("Witaj " + firstName + " " + lastName);
        } else if (firstName == null) {
            System.out.println("Dzień dobry panie/pani " + lastName);
        } else {
            System.out.println("Witaj nieznajomy");
        }
    }

    private void printPrices(double originalPrice, double discountPrice) {
        System.out.println("Kwota przed rabatem: " + originalPrice);
        System.out.println("Do zapłaty (po rabacie): " + discountPrice);
    }
}
