/**
 * Created by Piotr on 2019-09-19
 */
public class ComputerUpgrade {
    void addMemory(Computer computer, int additionalMemory) {
        //obiekt computer jest przekazywany przez referencje
        computer.memory += additionalMemory; //dodatkowa pamięć
    }
}
