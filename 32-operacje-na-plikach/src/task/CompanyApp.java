package task;

import java.io.*;
import java.rmi.NoSuchObjectException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyApp {
    static Scanner sc = new Scanner(System.in);
    static String fileName = "company.obj";
    public static void main(String[] args) {
        System.out.println("Informacje o pracownikach.");
        Company company = null;
        Option option;
        do {
            printOptions();
            option = getOption();
            switch (option) {
                case EXIT: break;
                case ADD_PEOPLE:
                    company = addEmployees();
                    printCompany(company);
                    break;
                case WRITE_FILE:
                    company = readFile();
                    printCompany(company);
                    break;
            }

        } while (option != Option.EXIT);
        sc.close();
    }
    private static void printCompany(Company company)
    {
        if (company != null)
        {
            System.out.println(company.toString());
        }
    }

    private static Company readFile() {
        Company company = null;
        try (
                var fis = new FileInputStream(fileName);
                var ois = new ObjectInputStream(fis)
                ) {
            company = (Company) ois.readObject();
        } catch (IOException e) {
            System.out.println("Niepoprawna wersja pliku.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Nie udało się odczytać pliku.");
        }
        return company;
    }

    private static Company addEmployees() {
        Company company = new Company();
        char onceAgain = 'N';
        boolean full = false;
        do {
            if (company.getIsEmptyPlace()) {
                boolean readComplete = false;
                while (!readComplete) {
                    try {
                        System.out.println("Podaj imię:");
                        String firstName = sc.nextLine();
                        System.out.println("Podaj nazwisko:");
                        String lastName = sc.nextLine();
                        System.out.println("Podaj wypłatę:");
                        double salary = sc.nextDouble();
                        sc.nextLine();
                        company.addPerson(new Employee(firstName, lastName, salary));
                        readComplete = true;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                        full = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Nieprawidłowo wprowadzone dane. Wprowadź ponownie.");
                    }
                }
                if (!full) {
                    System.out.println("Czy wprowadzić kolejnego pracownika? (T/N)");
                    onceAgain = sc.nextLine().toUpperCase().charAt(0);
                }
            }
        } while (onceAgain == 'T' && !full);
        writeObject(company);
        return company;
    }

    private static void writeObject(Company company) {
        try (
                var fs = new FileOutputStream(fileName);
                var os = new ObjectOutputStream(fs)
        ) {
            os.writeObject(company);
            System.out.println("Zapisano pracowników do pliku.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static Option getOption() {
        boolean optionOk = false;
        Option option = null;
        while (!optionOk) {
            try {
                option = Option.createFromInt(getInt());
                optionOk = true;
            } catch (NoSuchObjectException e) {
                System.out.println("Nie ma takiej opcji. Wybierz poprawnie.");
            } catch (InputMismatchException ignored) {
                System.out.println("Wprowadzona wartość nie jest liczbą. Podaj ponownie.");
            }
        }
        return option;
    }
    private static void printOptions() {
        System.out.println("2Wybierz opcję:");
        for (Option option : Option.values()) {
            System.out.println(option.toString());
        }
    }
    private static int getInt() {
        try {
            return sc.nextInt();
        } finally {
            sc.nextLine();
        }
    }
    private enum Option {
        EXIT(0, "Wyjście z programu"),
        ADD_PEOPLE(1, "Dodawanie nowych (nadpisywanie)"),
        WRITE_FILE(2, "Wczytaj zapisanych");
        private int value;
        private String description;

        Option(int value, String description) {
            this.value = value;
            this.description = description;
        }

        @Override
        public String toString() {
            return value + " " + description;
        }

        static Option createFromInt(int option) throws NoSuchObjectException {
            try {
                return Option.values()[option];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchObjectException("Brak opcji o id " + option);
            }
        }
    }
}
