package src.wlasne_klasy_wyjatkow;

public class School {
    private Student[] students;
    private int studentsNumber;
    public School(int studentsNumber) {
        students = new Student[studentsNumber];
    }

    public void add(Student s) throws NoMoreSpaceException {
        if (studentsNumber >= students.length) {
            throw new NoMoreSpaceException("Brak miejsca w School " + students.length);
        } else {
            students[studentsNumber] = s;
            studentsNumber++;
        }
    }

    public Student find(String firstName, String lastName) throws NoElementFoundException {
        int index = 0;
        while (index < students.length) {
            if (students[index].getFirstName().equals(firstName) &&
            students[index].getLastName().equals(lastName)) {
                return students[index];
            } else {
                index++;
            }
        }

        throw new NoElementFoundException("Nie znaleziono elementu " + firstName + " " + lastName);
    }
}
