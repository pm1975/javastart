package io.file;

import model.Library;

/**
 * Created by Piotr on 2019-11-12
 */
public interface FileManager {
    void exportData(Library library);
    Library importData();
}
