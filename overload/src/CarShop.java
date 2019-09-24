/**
 * Created by Piotr on 2019-09-24
 */
public class CarShop {
    public static void main(String[] args) {
        Car car = new Car(2017, "Audi", "A5", "czarny");
        Car car1 = new Car(2017, "Audi", "A5");
        System.out.println(car.model + " " + car.color);
        System.out.println(car1.model + " " + car1.color);

        car1.color = "czerwony";
        System.out.println(car1.model + " " + car1.color);

        System.out.println();
    }
}
