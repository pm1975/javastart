/**
 * Created by Piotr on 2019-10-03
 */
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[30];
        employees[0] = new Employee("Jan", "Nowak", 3500);
        employees[1] = new Employee("Marta", "Zięba", 3700);
        employees[2] = new Employee("Karol", "Wojak", 4500);

        int employeeIndex = 2;
        if (employeeIndex >= 0 && employeeIndex < employees.length) {
            System.out.println(employees[employeeIndex].getFirstName() + " " +
                    employees[employeeIndex].getLastName() + " " +
                    employees[employeeIndex].getSalary() + "zł");
        }
        System.out.println("Rozmiar tablicy: " + employees.length);
    }
}
