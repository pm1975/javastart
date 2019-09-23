/**
 * Created by Piotr on 2019-09-19
 */
public class Computer {
    //to jest tylko szablon
    String processor;
    int memory;

    public Computer() {
        System.out.println("Tworzę nowy komputer.");
    }

    public Computer(String processor) {
        this.processor = processor;
        memory = 8192;
    }

    public Computer(String processor, int memory) {
        this.processor = processor;
        this.memory = memory;
    }

    void printInfo() {
        System.out.println(getInfo());
    }

    String getInfo() {
        return processor + " " + memory;
    }
}
