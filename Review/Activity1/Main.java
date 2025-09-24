package Review.Activity1;

import java.util.ArrayList;

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
    }
}