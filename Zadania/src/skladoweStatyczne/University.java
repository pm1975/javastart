package skladoweStatyczne;

import java.util.Scanner;

/**
 * Created by Piotr on 2019-10-15
 */
public class University {
    final static int EXIT = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[100];
        do {
            System.out.println("Wprowadż nowego studenta:");
            System.out.println("Imię:");
            String firstName = input.nextLine();
            System.out.println("Nazwisko");
            String lastName = input.nextLine();
            students[Student.index] = new Student(firstName, lastName);
            Student.index++;

            System.out.println("Wprowadź kolejnego studenta, liczba inna niż " + EXIT);
            System.out.println("Koniec wprowadzania: wybierz liczbę: " + EXIT);
        } while (input.nextInt() != EXIT);
        if (Student.index > 1) {
            System.out.println("Liczba studentów: " + Student.index);
            for (int i = 0; i < Student.index; i++) {
                System.out.println(students[i].getFirstName() + " " + students[i].getLastName());
            }
        }
    }
}
