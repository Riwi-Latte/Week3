package Review.Activity11;

public abstract class Employee {

    public String id;
    public String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double monthlySalary();
}
