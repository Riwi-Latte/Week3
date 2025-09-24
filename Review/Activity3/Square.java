package Review.Activity3;

public class Square extends Shape {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        System.out.println(String.format(
                "El Area del cuadrado con base al lado " + side + "es: " + "%.2f", (side * side)));
        return side * side;
    }
}
