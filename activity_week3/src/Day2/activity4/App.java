package activity4;

public class App {
    public static void main(String[] args) {
        
        // Activity 4: Abstract with template method
        System.out.println("\n--- Ejecutando el proceso de CSV ---");
        Process csvProcess = new CsvProcess();
        csvProcess.execute();

        System.out.println("\n--- Ejecutando el proceso de JSON ---");
        Process jsonProcess = new JsonProcess();
        jsonProcess.execute();
    }
}
