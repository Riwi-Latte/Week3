package activity11;

public class FullTimeEmployee extends Employee implements Bonusable {
    private double baseSalary;
    
    public FullTimeEmployee(String id, String name, double baseSalary) {
        super(id, name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double monthlySalary() {
        return baseSalary;
    }

    @Override
    public double bonus() {
        return baseSalary * 0.10;
    }
}