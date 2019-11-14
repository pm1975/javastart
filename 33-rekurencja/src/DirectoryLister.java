import java.io.File;

/**
 * Created by Piotr on 2019-11-14
 */
public class DirectoryLister {
    public static void main(String[] args) {
        File file = new File("/Users/piotr/Programowanie/mac");
        showDirectories(file);
    }

    private static void showDirectories(File file) {
        File[] files = file.listFiles();

        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println("folder " + f.getAbsolutePath());
                    showDirectories(f);
                } else {
                    System.out.println("   plik " + f.getAbsolutePath());
                }
            }
        }
    }
}
