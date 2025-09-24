package Review.Activity11;

public class FullTimeEmployee extends Employee implements Bonusable {

    double baseSalary;

    FullTimeEmployee(String id, String name, double baseSalary) {
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
