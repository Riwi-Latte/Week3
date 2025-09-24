package activity3;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
         // Activity 3: More Abstract Classes(Abstract + polymorphism)
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Square(4.0));
        shapes.add(new Circle(5.0));
        shapes.add(new Square(7.5));
        shapes.add(new Circle(2.5));

        for (Shape shape : shapes) {
            System.out.println("El área de la forma " + shape.getClass().getSimpleName() + " es: "
                    + String.format("%.2f", shape.area()));
        }
    }
}
