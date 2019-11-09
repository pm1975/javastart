package task_correct;

import java.io.Serializable;

/**
 * Created by Piotr on 2019-11-09
 */
public class Company implements Serializable {
    private static final long serialVersionUID = -7425273230264572679L;
    public static final int EMPLOYEES = 3;
    private Employee[] employees = new Employee[EMPLOYEES];

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void add(Employee emp, int index) {
        employees[index] = emp;
    }
}
