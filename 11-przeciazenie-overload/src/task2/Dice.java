package task2;

import java.util.Random;

public class Dice {
    private int field;

    public Dice() {
        roll();
    }

    public Dice(int field) {
        this.field = field;
    }

    public void roll() {
        field = new Random().nextInt(6) + 1;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Liczba oczek na kostce: " + field;
    }
}
