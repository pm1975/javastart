package task_correct;

import java.util.Scanner;

public class CompanyApp {
    public static final int ADD_EMPLOYEE = 0;
    public static final int FIND_eMPLOYEE = 1;
    public static final int EXIT = 2;

    private static Company company = new Company();

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int userOption;
            do {
                printOptions();
                userOption = sc.nextInt();
                sc.nextLine();

                switch (userOption) {
                    case CompanyApp.ADD_EMPLOYEE:
                        addEmployee(sc);
                        break;
                    case CompanyApp.FIND_eMPLOYEE:
                        findAndPrintEmployee(sc);
                        break;
                    case CompanyApp.EXIT:
                        break;
                }
            } while (userOption != CompanyApp.EXIT);
        }
    }

    private static void findAndPrintEmployee(Scanner sc) {
        System.out.println("Wyszukiwanie pracownika.");
        System.out.println("Podaj imię: ");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = sc.nextLine();

        Employee employee = company.getEmployee(firstName, lastName);
        System.out.println(employee);
    }

    private static void addEmployee(Scanner sc) {
        Employee employee = new Employee();

        System.out.println("Dodawanie pracownika.");
        System.out.println("Imię: ");
        employee.setFirstName(sc.nextLine());
        System.out.println("Nazwisko: ");
        employee.setLastName(sc.nextLine());
        System.out.println("Pensja: ");
        employee.setSalary(sc.nextDouble());
        sc.nextLine();

        company.addEmployee(employee);
    }

    private static void printOptions() {
        System.out.println("0 - dodawanie pracownika");
        System.out.println("1 - wyszukiwanie pracownika");
        System.out.println("2 - Wyjście z programu");
    }
}
