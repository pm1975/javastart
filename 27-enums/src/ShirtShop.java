import java.util.Scanner;

/**
 * Created by Piotr on 2019-10-31
 */
public class ShirtShop {
    public static void main(String[] args) {
        System.out.println("Dostępne rozmiary tshirtów:");
        for (Size s : Size.values()) {
            System.out.println(s.getDescription());
        }

//        Size smallSize = Size.valueOf("SMALL");
//        System.out.println(smallSize);
//
//        String smallName = Size.SMALL.name();
//        String mediumName = Size.MEDIUM.name();
//        System.out.println(smallName + " " + mediumName);
//
//        int smallNumber = Size.SMALL.ordinal();
//        int mediumNumber = Size.MEDIUM.ordinal();
//        System.out.println(smallNumber + " " + mediumNumber);
//
//        Size[] values = Size.values();
//        for (Size value : values) {
//            System.out.print(value + " ");
//        }
//        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rozmiar: ");
        String sizeDesc = sc.nextLine(); // np. "Mały"
        Size size = Size.fromDescription(sizeDesc);
        Tshirt tshirt = new Tshirt();
        tshirt.setSize(size);
        System.out.println("Wybrałeś tshirt w rozmiarze: " + tshirt.getSize().getDescription());
    }
}
