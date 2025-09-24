package Spike_2;

public class Circle extends Shape {
    
    Double radius;

    public Circle(Double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        
        return Math.pow(radius, 2)*3.14;
    }

    @Override
    public String typeFigure() {
        
        return "Circulo";
    }
}
