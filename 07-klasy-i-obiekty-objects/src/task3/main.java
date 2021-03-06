package task3;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Plant> plants = new ArrayList<>();
        plants.add(new Plant("r1", "r1", 0.1));
        plants.add(new Plant("r2", "r2", 0.2));
        plants.add(new Plant("r3", "r3", 0.3));

        double sumDayConsuming = 0;
        for (Plant plant : plants) {
            sumDayConsuming += plant.water;
        }
        System.out.println("Dzienne zużycie wody: " + sumDayConsuming + ".");
        System.out.println("Tygodniowe zużycie wody: " + sumDayConsuming * 7 + ".");
        System.out.println("roczne zużycie wody (365 dni): " + sumDayConsuming * 365 + ".");
    }
}
