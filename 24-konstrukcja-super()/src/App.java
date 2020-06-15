/**
 * Created by Piotr on 2019-10-26
 */
public class App {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(60, 4096, 4500);
        System.out.println("Notebook");
        System.out.println(notebook.getCpuTemperature() + ", " +
                notebook.getRamMemory() + ", " +
                notebook.getBatteryCapacity());

        notebook.coolDown();
        System.out.println("Temperatura notebooka: ");
        System.out.println(notebook.getCpuTemperature());
    }
}
