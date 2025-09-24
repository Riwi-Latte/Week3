package activity2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        // Activity 2: Interface with return value
        ArrayList<Calculable> calculators = new ArrayList<>();
        calculators.add(new Addition());
        calculators.add(new Multiplication());

        for (Calculable calc : calculators) {
            double result = calc.calculate(3, 4);
            System.out.println(calc.getClass().getSimpleName() + ": " + result);
        }
    }
}
