package app;

import io.DataReader;
import model.Book;

/**
 * Created by Piotr on 2019-10-14
 */
public class LibraryApp {
    private static final String APP_NAME = "Biblioteka v1.0";

    public static void main(String[] args) {
        System.out.println(APP_NAME);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();
    }
}
