package app;

import io.DataReader;
import model.Book;

/**
 * Created by Piotr on 2019-09-09
 */
public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.8";

        Book[] books = new Book[1000];
        DataReader dataReader = new DataReader();

        System.out.println(appName);
        System.out.println("Wprowadź nową książkę:");
        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.close();

        books[0].printInfo();
        books[1].printInfo();

        System.out.println("System może przechowywać do " + books.length + " książek.");

//        books[0].printInfo2(); //option + Enter - IntelliJ tworzy automatycznie metodę (windows: alt+Enter)
        // command + B - przenosi do metody w klasie (definicji)
    }
}
