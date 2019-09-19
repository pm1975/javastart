/**
 * Created by Piotr on 2019-09-19
 */
public class Computer {
    String processor;
    int memory;

    void printInfo() {
        System.out.println(processor + " " + memory);
    }

    String getInfo() {
        return processor + " " + memory;
    }
}
