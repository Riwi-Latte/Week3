package activity4;

public class CsvProcess extends Process {

    @Override
    protected void prepare() {
        System.out.println("Preparando datos de CSV...");
    }

    @Override
    protected void process() {
        System.out.println("Procesando datos de CSV...");
    }
}