package dziedziczenie;

/**
 * Created by Piotr on 2019-10-24
 */
public class Test {
    public static void main(String[] args) {
        Tire tire = new Tire(1, "model", "Dębica", "185/65/14", 185, 14);
        System.out.println("Opona: ");
        System.out.println("numer: " + tire.getId());
        System.out.println("model: " + tire.getManufacturer());
        System.out.println("producent: " + tire.getProductName());
        System.out.println("seria: " + tire.getProductSeries());
        System.out.println("rozmiar: " + tire.getSize());
        System.out.println("szerokość: " + tire.getWidth());
    }
}
