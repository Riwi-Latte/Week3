package Spike_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Spike_2.Models.CsvProcess;
import Spike_2.Models.JsonProcess;
import Spike_2.Models.Product;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Operable> operables = new ArrayList<>();

        Engine engine = new Engine("Isabella");
        Fan fan = new Fan("Laura");

        operables.add(engine);
        operables.add(fan);

        for (Operable operable: operables){
            operable.start();
            operable.stop();
        }

        //Activity 2

        ArrayList<Calculable> calculables = new ArrayList<>();

        calculables.add(new Addition());
        calculables.add(new Multiplication());

        calculables.forEach((calculable)-> System.out.println(calculable.calculate(3, 4)));

        //Activity 3

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Square(5.0));
        shapes.add(new Circle(13.0));
        shapes.add(new Square(24.0));
        shapes.add(new Circle(8.0));

        shapes.forEach((shape)-> System.out.println("Forma: "+shape.typeFigure()+", Area: "+ shape.area()));


        //Activity 4

        CsvProcess csv = new CsvProcess();
        JsonProcess json = new JsonProcess();

        csv.execute();
        json.execute();


        //Activity 5

        ArrayList<Product> products = new ArrayList<>();
        
        products.add(new Product("asd145","Arroz",5000.0));
        products.add(new Product("asd149","Frijoles",18000.0));
        products.add(new Product("asd148","Lentejas",10000.0));
        products.add(new Product("asd147","Manzana",5000.0));
        products.add(new Product("asd146","Pera",4000.0));

        products.remove(1);
        products.get(0).setName("Piña");

        for (Product product : products) {
            
            System.out.println("Id: "+product.getId()+", Nombre: "+product.getName()+", Precio: "+product.getPrice());
        }

        //Activity 6

        ArrayList<String> words = new ArrayList<>();
        HashMap<String,Integer> count = new HashMap<>();


        words.add("Playa");
        words.add("Nieve");
        words.add("Mar");
        words.add("Arena");
        words.add("Rio");
        words.add("Mar");
        words.add("Nieve");
        words.add("Montaña");
        words.add("Playa");

        for (String word : words) {
            
            if(count.containsKey(word)){
                count.replace(word, count.get(word)+1);
                
            }else{
                count.put(word, 1);
                
            }

        }

        for (var wordCount : count.entrySet()) {
            
            if (wordCount.getValue()>1) {
                System.out.println("Palabra: "+wordCount.getKey()+"**"+" - Veces: "+wordCount.getValue());
                
            }else{
                System.out.println("Palabra: "+wordCount.getKey()+" - Veces: "+wordCount.getValue());
            }
        }

    }
}
