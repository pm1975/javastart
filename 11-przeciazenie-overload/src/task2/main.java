package task2;

public class main {
    public static void main(String[] args) {
        Dice dice = new Dice(6);
        for (int i = 0; i < 10; i++) {
            dice.roll();
        }
        System.out.println("----------");
        Dice dice1 = new Dice();
        for (int i = 0; i < 10; i++) {
            dice1.roll();
        }
    }
}
