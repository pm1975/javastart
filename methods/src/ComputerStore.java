/**
 * Created by Piotr on 2019-09-19
 */
public class ComputerStore {
    //sklep komputerowy
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory(); //new - wywołuje konstruktor
        Computer computer1 = computerFactory.create("Intel i5", 8192);
//        Computer computer1 = new Computer();
//        computer1.processor = "Intel i5";
//        computer1.memory = 8192;
//
        Computer computer2 = computerFactory.create("AMD Ryzen 1700", 16384);
//        Computer computer2 = new Computer();
//        computer2.processor = "AMD Ryzen 1700";
//        computer2.memory = 16384;

        computer1.printInfo();
        computer2.printInfo();

        //klient chce dodać 4GB ramu
        ComputerUpgrade computerUpgrade = new ComputerUpgrade();
        computerUpgrade.addMemory(computer1, 4096);
        System.out.println(computer1.getInfo());

        //konstruktory
        Computer computer3 = new Computer();

        Computer computer4 = new Computer("Intel i7");
        computer4.printInfo();

        Computer computer5 = new Computer("Intel i7", 16384);
        computer5.printInfo();

        computerUpgrade.addMemory(computer5, 16384);
        computer5.printInfo();


    }
}
