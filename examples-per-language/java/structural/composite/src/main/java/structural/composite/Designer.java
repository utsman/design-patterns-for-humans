package structural.composite;

public class Designer implements Employee {

    private String name;
    private float salary;

    public Designer(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public float getSalary() {
        return this.salary;
    }
}
