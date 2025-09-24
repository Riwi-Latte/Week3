package Spike_2;

public class Square extends Shape{
    
    Double side;

    public Square(Double side){
        this.side = side;
    }

    @Override
    public double area() {
        
        return side * side;
    }

    @Override
    public String typeFigure() {
        
        return "Cuadrado";
    }
}
