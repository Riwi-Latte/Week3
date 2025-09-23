package models;
import my_interface.Calculable;

public class Multiplication implements Calculable {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}