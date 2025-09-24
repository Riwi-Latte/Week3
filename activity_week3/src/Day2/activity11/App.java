package activity11;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        
        employees.add(new FullTimeEmployee("F001", "Sara Pérez", 50000));
        employees.add(new HourlyEmployee("H002", "Yeferson Garcia", 160, 25));
        employees.add(new FullTimeEmployee("F003", "Luis García", 60000));
        employees.add(new HourlyEmployee("H004", "Alejandro Marin", 120, 30));

        double totalSalary = 0;

        for (Employee emp : employees) {
            double salary = emp.monthlySalary();
            double bonus = 0;

            if (emp instanceof Bonusable) {
                Bonusable bonusEmp = (Bonusable) emp;
                bonus = bonusEmp.bonus();
            }

            totalSalary += salary + bonus;

            System.out.printf("\n- Empleado %s: Salario = %.2f, Bono = %.2f, Total = %.2f%n",
                              emp.name, salary, bonus, salary + bonus);
        }

        System.out.println("------------------------------------");
        System.out.printf("Salario total de la compañía: %.2f%n", totalSalary);
    }
    
}
