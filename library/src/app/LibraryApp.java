package app;

import io.DataReader;
import model.Book;

/**
 * Created by Piotr on 2019-10-14
 */
public class LibraryApp {
    public static void main(String[] args) {
        private static final String APP_NAME = "Biblioteka v1.0";
        System.out.println(APP_NAME);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();
    }
}
