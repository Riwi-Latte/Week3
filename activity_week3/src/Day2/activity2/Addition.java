package activity2;

public class Addition implements Calculable {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }

    
    public double rest(double a, double b) {
        return a - b;
    }
}

