package Spike_2.Models;

public class JsonProcess extends Process{
    
    @Override
    public void process() {
        System.out.println("Procesando json ...");
    }

    @Override
    public void prepare() {
        System.out.println("Preparando json ...");
    }
}
