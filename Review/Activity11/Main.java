package Review.Activity11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("E1", "Camilo", 2000000));
        employees.add(new FullTimeEmployee("E2", "Ramon", 2500000));
        employees.add(new HourlyEmployee("E3", "Alejandra", 120, 15));
        employees.add(new HourlyEmployee("E4", "Diana", 100, 20));

        double total = 0;

        for (Employee employee : employees) {
            double salary = employee.monthlySalary();

            if (employee instanceof Bonusable) {
                salary += ((Bonusable) employee).bonus();
            }

            total += salary;

        }

        System.out.println("\nTotal (salaries + bonuses) = " + total);

    }
}
