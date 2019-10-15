package skladoweStatyczne;

/**
 * Created by Piotr on 2019-10-15
 */
public class Student {
    private static int studentsNumbers = 0;
    private String firstName;
    private String lastName;
    private int index;

    public Student(String firstName, String lastName, int index) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = index;
        //po każdym wywołaniu konstruktora zwiększamy liczbę studentów
        studentsNumbers++;
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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static int getStudentsNumbers() {
        return studentsNumbers;
    }
}
