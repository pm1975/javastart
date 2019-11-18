package task;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Piotr on 2019-11-18
 */
public class PersonDatabase {
    private static int MAX_PEOPLE = 1;
    private Person[] people = new Person[MAX_PEOPLE];
    private int lastInt = 0;

    void add(Person p) {
        if (lastInt == MAX_PEOPLE) {
            MAX_PEOPLE *= 2;
            people = Arrays.copyOf(people, MAX_PEOPLE);
        }
        people[lastInt] = p;
        lastInt++;
    }

    void remove(Person p) {
        Person[] people1 = new Person[people.length];
        int k = 0;
        for (int i = 0; i < size(); i++) {
            if (!people[i].equals(p)) {
                people1[k++] = people[i];
            }
        }
        Arrays.fill(people, null);
        people = Arrays.copyOf(people1, people1.length);
    }

    Person get(int index) {
        return people[index];
    }

    int size() {
        int s = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                break;
            }
            s = i + 1;
        }
        lastInt = s;
        return s;
    }
}
