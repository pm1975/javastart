package task4;

public class House {
    private double water;
    private double fuel;

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public House(double water, double oil) {
        this.water = water;
        this.fuel = oil;
    }

    public void takeShower() {
        System.out.println("Bierzemy prysznic");
        water-=48;
    }

    public void takeBath() {
        System.out.println("Bierzemy kąpiel");
        water-=86;
    }

    public void makeDinner() {
        System.out.println("Robimy obiad");
        fuel -= 0.1;
        water -= 4;
    }

    public void boilWater() {
        System.out.println("Gotujemy wodę");
        fuel -= 0.05;
        water-= 0.5;
    }

    public void watchTv(int hours) {
        System.out.println("Oglądamy TV przez " + hours + " godzin.");
        fuel -= (hours*0.06);
    }

    @Override
    public String toString() {
        return "Ilość wody: " + water + " litrów, ropa: " + fuel + " litrów.";
    }

}
