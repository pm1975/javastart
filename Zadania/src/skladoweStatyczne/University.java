package skladoweStatyczne;

import java.util.Scanner;

/**
 * Created by Piotr on 2019-10-15
 */
public class University {
    final static int EXIT = 0;

    public static void main(String[] args) {
        System.out.println("Liczba studentów przed zapisami: " + Student.getStudentsNumbers());
        Student s1 = new Student("Jan", "Kowalski", 1234);
        Student s2 = new Student("Marek", "Jarosz", 4345);
        System.out.println("Liczba studentów po zapisach: " + Student.getStudentsNumbers());
    }
}
