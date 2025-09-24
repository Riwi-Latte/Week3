package activity11;

public abstract class Employee {
    protected String id; 
    protected String name; 

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract double monthlySalary();
}
