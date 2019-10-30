package z26_metody_klasy_object.moja_proba;

import z26_metody_klasy_object.moja_proba.Computer;
import z26_metody_klasy_object.moja_proba.DataStore;

/**
 * Created by Piotr on 2019-10-30
 */
public class NotebookShop {
    public static void main(String[] args) {
        Computer computer1 = new Computer("laptop1", 123);
        Computer computer2 = new Computer("laptop1", 123);
        Computer computer3 = new Computer("laptop3", 133);
        Computer computer4 = new Computer("laptop3", 134);
        Computer computer5 = new Computer("laptop5", 135);

        DataStore dataStore = new DataStore();
        dataStore.add(computer1);
        dataStore.add(computer2);
        dataStore.add(computer3);
        dataStore.add(computer4);
        dataStore.add(computer5);

        int theSame = dataStore.checkAvailability(computer1);
        System.out.println("Takich samych notebooków: " + theSame);
        dataStore.getInfo();
    }
}
