package tasks;

public class task2 {
    public static void main(String[] args) {
        double netto = 100;
        double tax = 0.23;
        double vatAmount = netto * tax;
        double brutto = netto + vatAmount;

        System.out.println("Cena netto: " + netto);
        System.out.println("Kwota VAT: " + vatAmount);
        System.out.println("Do zapłaty (brutto): " + brutto);
    }
}
