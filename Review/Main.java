package Review;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n========== Activity 1 – Basic interface =========\n");

        ArrayList<Operable> operables = new ArrayList<>();
        Operable engine = new Engine();
        Operable fan = new Fan();

        operables.add(engine);
        operables.add(fan);

        for (Operable operable : operables) {
            operable.start();
            operable.stop();
        }

        System.out.println("\n========== Activity 2 – Interface with return value =========\n");

        ArrayList<Calculable> calculables = new ArrayList<>();

        Calculable multiplication = new Multiplication();
        Calculable addition = new Addition();

        calculables.add(addition);
        calculables.add(multiplication);

        for (Calculable calculable : calculables) {
            System.out.println(calculable.calculate(3, 4) + "\n");
        }

        System.out.println("\n========== Activity 3 – Abstract + polymorphism =========\n");

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Square(5));
        shapes.add(new Circle(10));
        shapes.add(new Circle(7));
        shapes.add(new Square(8));

        for (Shape shape : shapes) {
            shape.area();
        }

        System.out.println("\n========== Activity 4 – Abstract with template =========\n");

        Process csv = new CsvProcess();
        Process json = new JsonProcess();

        csv.execute();
        json.execute();

        System.out.println("\n========== Activity 5 – Catalog with ArrayList =========\n");

        ArrayList<Product> products = new ArrayList<>();

        Product p1 = new Product("1", "papa", 3000);
        Product p2 = new Product("2", "arroz", 2000);
        Product p3 = new Product("3", "cilantro", 200);
        Product p4 = new Product("4", "yuca", 3500);
        Product p5 = new Product("5", "platano", 4000);

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        products.remove(0);
        products.get(0).name = "arrozz";

        for (Product product : products) {
            System.out.println(product.name + "\n");
        }

        System.out.println("\n========== Activity 6 – Index with HashMap =========\n");

        ArrayList<String> words = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        words.add("Java");
        words.add("Java");
        words.add("Python");
        words.add("C");
        words.add("C");
        words.add("Java");
        words.add("Java");
        words.add("Java");

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("\n========== Activity 7 – Interface + HashMap =========\n");



    }
}
