package logic;

import data.Car;

class CarShop {
    public static void main(String[] args) {
        Car car1 = new Car(2017, "Audi", "A5", "czarny");
        Car car2 = new Car(2017, "Audi", "A5");
        //w międzyczasie klient wybiera kolor:
        car2.setColor("czerwony");
        car2.setYear(-1000);
        car2.setYear(2018);

        car1.print();
        car2.print();

    }
}

