package Review.Activity2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n========== Activity 2 – Interface with return value =========\n");

        ArrayList<Calculable> calculables = new ArrayList<>();

        Calculable multiplication = new Multiplication();
        Calculable addition = new Addition();

        calculables.add(addition);
        calculables.add(multiplication);

        for (Calculable calculable : calculables) {
            System.out.println(calculable.calculate(3, 4) + "\n");
        }
    }
}