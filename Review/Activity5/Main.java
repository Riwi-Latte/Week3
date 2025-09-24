package Review.Activity5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

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
    }
}