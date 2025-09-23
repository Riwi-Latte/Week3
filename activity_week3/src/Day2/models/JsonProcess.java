package models;
import my_abstract.Process;

public class JsonProcess extends Process {

    @Override
    protected void prepare() {
        System.out.println("Preparando datos de JSON...");
    }

    @Override
    protected void process() {
        System.out.println("Procesando datos de JSON...");
    }
}