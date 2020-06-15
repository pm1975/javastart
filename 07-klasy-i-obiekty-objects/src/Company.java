/**
 * Created by Piotr on 2019-09-16
 */
public class Company {
    public static void main(String[] args) {
        Employee getPracownik1 = new Employee("Piotr", "Mierniczak", 1975, 16);
        Employee getPracownik2 = new Employee("Bożena", "Mierniczak", 1975, 12);
        Employee getPracownik3 = new Employee("Jan", "Nowak", 2000, 1);

        System.out.println(getPracownik1.getInfo());
        System.out.println(getPracownik2.getInfo());
        System.out.println(getPracownik3.getInfo());
    }
}
