package activity5;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

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
