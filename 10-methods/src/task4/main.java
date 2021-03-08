package task4;

public class main {
    public static void main(String[] args) {
        House house = new House(10000.0, 1000);
        System.out.println(house);
        house.boilWater();
        System.out.println(house);
        house.watchTv(4);
        System.out.println(house);
        house.makeDinner();
        System.out.println(house);
    }
}
