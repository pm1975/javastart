/**
 * Created by Piotr on 2019-09-24
 */
public class Car {
    int year;
    String brand; //marka
    String model;
    String color;

    public Car(int year, String brand, String model, String color) {
        this(year, brand, model);
        this.color = color;
    }

    public Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
    }

}
