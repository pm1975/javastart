package task_correct;

import java.util.Objects;

/**
 * Created by Piotr on 2019-11-18
 */
public class Person {
    private String firstName;
    private String lastName;
    private String pesel;

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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Person(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person[firstName=" + firstName + ", lastName=" + lastName + ", pesel=" + pesel + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (firstName == null) {
            if(other.firstName !=null)
                return  false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if(other.lastName !=null)
                return  false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (pesel == null) {
            if(other.pesel !=null)
                return  false;
        } else if (!pesel.equals(other.pesel))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, pesel);
    }
}
