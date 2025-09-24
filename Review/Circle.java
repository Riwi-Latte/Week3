package Review;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        System.out.println(
                String.format("El Area del circulo con base al radio " + radius + " es:" + "%.2f",
                        (Math.PI * radius * radius)));
        return Math.PI * radius * radius;
    }
}
