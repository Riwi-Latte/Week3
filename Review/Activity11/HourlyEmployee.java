package Review.Activity11;

public class HourlyEmployee extends Employee {

    public int hours;
    public double rate;

    public HourlyEmployee(String id, String name, int hours, double rate) {
        super(id, name);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double monthlySalary() {
        return hours * rate;
    }
}
