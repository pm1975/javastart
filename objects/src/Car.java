/**
 * Created by Piotr on 2019-09-13
 */
public class Car {
    int doors = 4;
    String carColor;
    String wheelsColor; //felgi
    String tiresColor = "czarne"; //opony
    String brand; //marka
    String model;

    public String getInfo() {
        return brand + " " + model
                + ", Drzwi: " + doors
                + ", Kolor nadwozia: " + carColor
                + ", Kolor felg: " + wheelsColor
                + ", kolor opon: " + tiresColor;
    }
}
