package petle2;

import java.util.Scanner;

/**
 * Created by Piotr on 2019-10-09
 */
public class HospitalApp {
    public static void main(String[] args) {
        final int exit = 0;
        final int addPatient = 1;
        final int printPatients = 2;
        Scanner input = new Scanner(System.in);
        int option = -1;
        Hospital hospital = new Hospital();
        while (option != 0) {
            showMenu();
            option = input.nextInt();
            switch (option) {
                case exit:
                    System.out.println("Zamykam program!");
                    break;
                case addPatient:
                    additionalPatient(hospital);
                    break;
                case printPatients:
                    hospital.printPatients();
                    break;
                default:
                    System.out.println("Niepoprawna opcja");
            }
        }
        input.close();
    }

    private static void showMenu() {
        System.out.print("\033[H\033[2J");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - dopisanie pacjenta");
        System.out.println("2 - wyświetlenie listy zapisanych pacjentów");
    }

    private static void additionalPatient(Hospital hospital) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dane pacjenta:");
        System.out.print("imię: ");
        String firstName = sc.nextLine();
        System.out.print("nazwisko: ");
        String lastName = sc.nextLine();
        System.out.print("pesel: ");
        String pesel = sc.nextLine();
        Patient patient = new Patient(firstName, lastName, pesel);
        hospital.addPatient(patient);
    }
}
