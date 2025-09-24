package Review.Activity4;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n========== Activity 4 – Abstract with template =========\n");

        Process csv = new CsvProcess();
        Process json = new JsonProcess();

        csv.execute();
        json.execute();
    }
}