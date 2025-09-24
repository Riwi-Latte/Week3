package Spike_2.Models;

public class CsvProcess extends Process {
    

    @Override
    public void process() {
        System.out.println("Procesando csv ...");
    }

    @Override
    public void prepare() {
        System.out.println("Preparando csv ...");
    }
}
