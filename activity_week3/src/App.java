import java.util.List;


import my_interface.Operable;
import models.Engine;
import models.Fan;
import models.JsonProcess;
import my_interface.Calculable;
import models.Addition;
import models.Multiplication;
import my_abstract.Shape;
import models.Square;
import models.Circle;
import models.CsvProcess;
import my_abstract.Process;
import models.Product;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // Acivity 1: Interfaces
        List<Operable> operableDevices = new ArrayList<>();

        Engine carEngine = new Engine("Car");
        Engine motorcycleEngine = new Engine("Motorcycle");
        Fan ceilingFan = new Fan("Ceiling");
        Fan desktopFan = new Fan("Desktop");

        operableDevices.add(carEngine);
        operableDevices.add(motorcycleEngine);
        operableDevices.add(ceilingFan);
        operableDevices.add(desktopFan);

        for (Operable device : operableDevices) {
            device.start();
            device.stop();
            System.out.println();
        }


        // Activity 2: Abstract Classes
        ArrayList<Calculable> calculators = new ArrayList<>();
        calculators.add(new Addition());
        calculators.add(new Multiplication());

        for (Calculable calc : calculators) {
            double result = calc.calculate(3, 4);
            System.out.println(calc.getClass().getSimpleName() + ": " + result);
        }


        // Activity 3: More Abstract Classes(Abstract + polymorphism)
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Square(4.0));
        shapes.add(new Circle(5.0));
        shapes.add(new Square(7.5));
        shapes.add(new Circle(2.5));

        for (Shape shape : shapes) {
            System.out.println("El área de la forma es: " + shape.area());
        }



        // Activity 4: Abstract with template method
        System.out.println("\n--- Ejecutando el proceso de CSV ---");
        Process csvProcess = new CsvProcess();
        csvProcess.execute();

        System.out.println("\n--- Ejecutando el proceso de JSON ---");
        Process jsonProcess = new JsonProcess();
        jsonProcess.execute();


        // Activity 5: Collections(Catalog with ArrayList)
        ArrayList<Product> catalog = new ArrayList<>();

        catalog.add(new Product("P001", "Laptop", 1200.50));
        catalog.add(new Product("P002", "Mouse", 25.000));
        catalog.add(new Product("P003", "Keyboard", 75.990));
        catalog.add(new Product("P004", "Monitor", 300.00));
        catalog.add(new Product("P005", "Webcam", 50.000));
        
        System.out.println("\nCatálogo inicial:");
        printCatalog(catalog);
        
        catalog.remove(1);
        System.out.println("\nCatálogo después de eliminar el segundo producto:");
        printCatalog(catalog);

        Product firstProduct = catalog.get(0);
        firstProduct.setName("Laptop Gaming");
        System.out.println("\nCatálogo después de actualizar el nombre del primer producto:");
        printCatalog(catalog);
    }

    private static void printCatalog(ArrayList<Product> catalog) {
        for (Product p : catalog) {
            System.out.println(p);
        }
    }

}
