package Spike_2;

import java.util.ArrayList;

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
    }
}
