package task3;

public class Shop {
    public static void main(String[] args) {
        Product product = new Product("Czekolada mleczna", "Milka");
        Offer offer = new Offer(product, 3.99, true);
        System.out.println(offer);;
    }
}
