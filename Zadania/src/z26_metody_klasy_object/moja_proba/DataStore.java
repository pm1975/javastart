package z26_metody_klasy_object.moja_proba;

import z26_metody_klasy_object.moja_proba.Computer;

/**
 * Created by Piotr on 2019-10-30
 */
public class DataStore {
    private static final int MAX_COMPUTERS = 100;
    private Computer[] computers = new Computer[MAX_COMPUTERS];
    private int getMaxComputers;

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public int getGetMaxComputers() {
        return getMaxComputers;
    }

    public void setGetMaxComputers(int getMaxComputers) {
        this.getMaxComputers = getMaxComputers;
    }

    public void add(Computer computer) {
        if (getGetMaxComputers() < MAX_COMPUTERS && computer != null) {
            getComputers()[getGetMaxComputers()] = computer;
            setGetMaxComputers(getGetMaxComputers() + 1);
        }
    }

    public void getInfo() {
        System.out.println("Informacja o notebookach: ");
        for (int i = 0; i < getGetMaxComputers(); i++) {
            System.out.println(getComputers()[i].toString());
        }
    }

    public int checkAvailability(Computer computer) {
        if (computer == null) return 0;

        int theSame = 0;
        for (int i = 0; i < getGetMaxComputers(); i++) {
            if (getComputers()[i].equals(computer)) {
                theSame++;
            }
        }
        return theSame;
    }
}
