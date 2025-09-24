package Review.Activity3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n========== Activity 3 – Abstract + polymorphism =========\n");

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Square(5));
        shapes.add(new Circle(10));
        shapes.add(new Circle(7));
        shapes.add(new Square(8));

        for (Shape shape : shapes) {
            shape.area();
        }
    }
}