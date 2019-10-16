package app;

import io.DataReader;
import model.Book;

/**
 * Created by Piotr on 2019-10-14
 */
public class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.9";
        System.out.println(appName);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();
    }
}
