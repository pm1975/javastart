/**
 * Created by Piotr on 2019-10-02
 */
/*  enkapsulacja
    wydzielanie powtarzającego się kodu do osobnej klasy,
    albo jeszcze bardziej, do osobnej metody.
*/
class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client(null, "Kowalski", true);
        double price = 1100; //zł

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100; //zł

        DiscountService discountService = new DiscountService();
        double discountPrice = discountService.calculateDiscountPrice(client1, price);
        double discountPrice2 = discountService.calculateDiscountPrice(client2, price2);

        PrintService printService = new PrintService();
        printService.printSummary(client1, price, discountPrice);
        printService.printSummary(client2, price2, discountPrice2);
    }
}
