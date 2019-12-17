package task;

import java.util.Scanner;

/**
 * Created by Piotr on 2019-12-12
 */
public class Test {
    public static void main(String[] args) {
        try (
                Scanner sc = new Scanner(System.in)
        ) {
            System.out.println("Dodawanie osoby.");
            System.out.println("Wprowadź imię:");
            String fn = sc.nextLine();
            System.out.println("Wprowadź nazwisko:");
            String ln = sc.nextLine();
            System.out.println("Wprowadź wypłatę:");
            double salary = sc.nextDouble();
            sc.nextLine();
            Company company = new Company();
            company.addNewPeople(new Employee(fn, ln, salary));
        }
    }
}
