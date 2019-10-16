package app;

import io.DataReader;
import model.Book;
import model.Library;

/**
 * Created by Piotr on 2019-10-14
 */
public class LibraryControl {
    //zmienne do kontrolowania programu programu
    private final int exit = 0;
    private final int addBook = 1;
    private final int printBooks = 2;

    //zmienna do komunikacji z użytkownikiem
    private DataReader dataReader = new DataReader();

    //"biblioteka" przechowująca dane
    private Library library = new Library();

    /*
    * Główna metoda programu, która pozwala na wybór opcji i interakcję
    * */

    public void controlLoop() {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case addBook:
                    addBook();
                    break;
                case printBooks:
                    printBooks();
                    break;
                case exit:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
        } while (option != exit);
    }

    private void exit() {
        System.out.println("Koniec programu!");
        //zamykamy strumień wejścia
        dataReader.close();
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję:");
        System.out.println(exit + " - wyjście z programu");
        System.out.println(addBook + " - dodanie nowej książki");
        System.out.println(printBooks + " - wyświetl dostępne książki");
    }
}
