package src.instrukcja_throw;

import src.instrukcja_throw.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        try {
            car.refuel(60);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println(car);
        try {
            car.drive();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println(car);
    }
}
