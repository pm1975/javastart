package task_correct;

import java.io.Serializable;

/**
 * Created by Piotr on 2019-11-09
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 3812017177088336529L;

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Person() {}

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
