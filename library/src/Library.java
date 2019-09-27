/**
 * Created by Piotr on 2019-09-09
 */
public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.4";

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010,
                296, "Greg", "9788373271890");
        Book book2 = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009,
                352, "Helion", "9788324620845");
        Book book3 = new Book("Pismo Święte starego i nowego testamentu", "Zespół biblistów polskich",
                1980, 1439, "Pallottinum");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

        book1.printInfo2(); //option + Enter - IntelliJ tworzy automatycznie metodę (windows: alt+Enter)
        // command + B - przenosi do metody w klasie (definicji)
    }
}
