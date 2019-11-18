package task;

/**
 * Created by Piotr on 2019-11-18
 */
public class App {
    public static void main(String[] args) {
        PersonDatabase personDatabase = new PersonDatabase();
        Person p1 = new Person("Piotr", "Mierniczak", "123456");
        Person p2 = new Person("Bożena", "Mierniczak", "234567");
        Person p3 = new Person("Barbara", "Mierniczak", "345678");
        Person p4 = new Person("Anna", "Mierniczak", "456789");
        Person p5 = new Person("Krzysztof", "Mierniczak", "567899");
        personDatabase.add(p1);
        personDatabase.add(p2);
        personDatabase.add(p3);
        personDatabase.add(p4);
        personDatabase.add(p5);
        printInfo(personDatabase);
        System.out.println("Usuwanie z tablicy: " + p3.toString());
        System.out.println();
        personDatabase.remove(p3);
        printInfo(personDatabase);
    }

    private static void printInfo(PersonDatabase personDatabase) {
        System.out.println("Zawartość tablicy:");
        for (int i = 0; i < personDatabase.size(); i++) {
            System.out.println(personDatabase.get(i).toString());
        }
        System.out.println("Rozmiar tablicy: " + personDatabase.size());
        System.out.println();
    }
}
