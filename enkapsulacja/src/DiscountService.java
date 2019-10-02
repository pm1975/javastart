/**
 * Created by Piotr on 2019-10-02
 */
//Service - wykonują logikę biznesową, wykonują pewne operacje
//discount (zniżka)
class DiscountService {
    //oblicz cenę po obniżce
    public  double calculateDiscountPrice(Client client, double price) {
        if (client.isPremium()) {
            return calculatePremiumDiscount(price);
        } else {
            return calculateStandardDiscount(price);
        }
    }

    private double calculateStandardDiscount(double price) {
        if (price > 1000) {
            return applyDiscount(price, 0.1);
        } else {
            return price;
        }
    }

    private double calculatePremiumDiscount(double price) {
        if (price > 1000) {
            return applyDiscount(price, 0.15);
        } else {
            return applyDiscount(price, 0.05);
        }
    }

    //zaaplikuj rabat do oryginalnej ceny
    //discount (zniżka)
    private double applyDiscount(double price, double discount) {
        return price * (1 - discount);
    }
}
