/**
 * Created by Piotr on 2019-09-16
 */
public class Employee {
    String firstName;
    String lastName;
    int birthYear;
    int soniority; //staż pracy

    public Employee() {}

    public Employee(String firstName, String lastName, int birthYear, int soniority)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.soniority = soniority;
    }

    public String getInfo() {
        return "Imie: " + firstName + ", nazwisko: " + ", rok urodzenia: " + birthYear + ", staż pracy: " + soniority + ".";
    }
}
