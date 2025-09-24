package activity11;

public class HourlyEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    
    public HourlyEmployee(String id, String name, int hoursWorked, double hourlyRate) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double monthlySalary() {
        return hoursWorked * hourlyRate;
    }
}
