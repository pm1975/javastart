/**
 * Created by Piotr on 2019-09-19
 */
public class Computer {
    //to jest tylko szablon
    String processor;
    int memory;

    void printInfo() {
        System.out.println(getInfo());
    }

    String getInfo() {
        return processor + " " + memory;
    }
}
