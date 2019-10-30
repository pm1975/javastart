package z25_polimorfizm.poprawnie;

/**
 * Created by Piotr on 2019-10-30
 */
public class Hospital {
    private static final int MAX_EMPLOYEES = 3;

    private Person[] employees = new Person[MAX_EMPLOYEES];
    private int employeesNumber;

    public Person[] getEmployees() {
        return employees;
    }

    public void setEmployees(Person[] employees) {
        this.employees = employees;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public void add(Person person) {
        if (getEmployeesNumber() < MAX_EMPLOYEES) {
            getEmployees()[getEmployeesNumber()] = person;
            setEmployeesNumber(getEmployeesNumber() + 1);
        }
    }

    public String getInfo() {
        String result = "";
        for (int i = 0; i < employeesNumber; i++) {
            result += employees[i].getInfo() + "\n";
        }
        return result;
    }
}
