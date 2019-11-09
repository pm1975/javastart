package src.task;

import java.io.BufferedReader;
import java.io.Serializable;

public class Company implements Serializable {
    private static final int MAX_EMPLOYEE = 3;
    private int countEmployee;

    public boolean getIsEmptyPlace() {
        if (countEmployee < MAX_EMPLOYEE)
            return true;
        else return false;
    }

    Employee[] employees = new Employee[MAX_EMPLOYEE];

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void addPerson(Employee employee) throws ArrayIndexOutOfBoundsException {
        if (countEmployee < MAX_EMPLOYEE) {
            employees[countEmployee] = employee;
            countEmployee++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Baza jest pełna.");
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < countEmployee; i++) {
            builder.append(employees[i].toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}
