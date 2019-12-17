package task;


import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        Option option;
        do {
            option = chooseOption();
            switch (option) {
                case EXIT:break;
                case SEARCH: findPerson(company); break;
                case ADD: addPerson(company);break;
            }
        } while (option != Option.EXIT);
    }

    private static void addPerson(Company company) {
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
            company.addNewPeople(new Employee(fn, ln, salary));
        }
    }

    private static void findPerson(Company company) {
        try (
                Scanner sc = new Scanner(System.in)
        ) {
            System.out.println("Szukanie osoby.");
            System.out.println("Podaj imię:");
            String fn = sc.nextLine();
            System.out.println("Podaj nazwisko:");
            String ln = sc.nextLine();
            System.out.println(company.findPeople(fn, ln));
        }
    }

    static void printMenu() {
        System.out.println("Wybierz opcję:");
        for (Option value : Option.values()) {
            System.out.println(value);
        }
    }
    static Option chooseOption() {
        while (true) {
            printMenu();
            try (
                    Scanner sc = new Scanner(System.in)
            ) {
                return Option.getOption(getInt(sc));
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }
    }

    private static int getInt(Scanner sc) {
        try {
            return sc.nextInt();
        } finally {
            sc.nextLine();
        }
    }

    private enum Option {
        ADD(1, "Dodaj pracownika"),
        SEARCH(2, "Wyszukaj pracownika"),
        EXIT(3, "Wyjście");

        @Override
        public String toString() {
            return value + ". " + description + '.';
        }

        private int value;
        private String description;

        Option(int value, String description) {
            this.value = value;
            this.description = description;
        }

        final static Option getOption(int optionValue) {
            for (Option l : Option.values()) {
                if (l.value == optionValue) return l;
            }
            throw  new IllegalArgumentException("Nie ma takiej opcji.");
        }

    }
}
