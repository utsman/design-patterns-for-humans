package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public float getNetSalaries() {
        float netSalary = 0;
        for (Employee employee : employees) {
            netSalary += employee.getSalary();
        }
        return netSalary;
    }
}
