package models;
import my_interface.Calculable;

public class Addition implements Calculable {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}

