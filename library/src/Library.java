/**
 * Created by Piotr on 2019-09-09
 */
public class Library {
    public static void main(String[] args) {
//        final String appName = "Biblioteka v0.2";
//
//        Book book1 = new Book();
//        book1.title = "W pustyni i w puszczy";
//        book1.author = "Henryk Sienkiewicz";
//        book1.releaseDate = 2010;
//        book1.pages = 296;
//        book1.publisher = "Greg";
//        book1.isbn = "9788373271890";
//
//        System.out.println(appName);
//        System.out.println("Książki w bibliotece:");
//        System.out.println(book1.title);
//        System.out.println(book1.author);
//        System.out.println(book1.releaseDate);
//        System.out.println(book1.pages);
//        System.out.println(book1.publisher);
//        System.out.println(book1.isbn);
        final String appName = "Biblioteka v0.3";

        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010,
                296, "Greg", "9788373271890");
        Book book2 = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009,
                352, "Helion", "9788324620845");
        Book book3 = new Book("Pismo Święte starego i nowego testamentu", "Zespół biblistów polskich",
                1980, 1439, "Pallottinum", "nie ma");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}
