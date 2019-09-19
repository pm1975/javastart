/**
 * Created by Piotr on 2019-09-19
 */
public class ComputerFactory {
    Computer create(String processor, int memory) {
        Computer computer = new Computer();
        computer.processor = processor;
        computer.memory = memory;
        return computer;
    }
}
