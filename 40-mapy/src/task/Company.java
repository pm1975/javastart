package task;

import java.util.HashMap;
import java.util.Map;

public class Company {

    Map<String, Employee> people = new HashMap<>();

    public void addNewPeople(Employee employee) {
        people.put(employee.getLastName() + employee.getLastName(), employee);
    }

    public String findPeople(String firstName, String lastName) {
        Employee employee = people.get(firstName + lastName);
        return employee.toString();
    }
}
