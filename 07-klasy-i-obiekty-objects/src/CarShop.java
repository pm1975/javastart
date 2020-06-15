/**
 * Created by Piotr on 2019-09-13
 */
public class CarShop {
    public static void main(String[] args) {
        //OBIEKT - BARDZIEJ ZŁOŻONY TYP DANYCH
        Car car1 = new Car();
        //car1 ------> ("Audi", "A4"...) referencja (wskaźnik na obiekt)
        car1.brand = "Audi";
        car1.model = "A4";
        car1.doors = 4;
        car1.carColor = "Czarny";
        car1.wheelsColor = "Srebrny";
        car1.tiresColor = "Czarny";

        System.out.println(car1);//Car@xxxxx (losowe znaki)
        System.out.println();
        System.out.println("Wybrałeś następujący samochód: ");
        System.out.println(car1.getInfo());

//        Car audiCopy = audi;
//        audiCopy.model = "A5";
//        System.out.println(audi.model);

        Car audi2 = new Car();
        audi2.brand = "Audi";
        audi2.model = "A5";
        System.out.println(audi2.model);

//        Car audi3 = null;
//        audi3.brand = "audi";
//        System.out.println(audi3.brand); //NullPointerException

        boolean isCar = car1 instanceof Car;
        System.out.println(isCar);
    }
}
