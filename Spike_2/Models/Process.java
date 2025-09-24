package Spike_2.Models;

public abstract class Process {
    
    public final void execute(){
        process();
        prepare();
        finish();
    };

    public abstract void prepare();

    public abstract void process();
    
    public void finish(){
        System.out.println("Ok");
    };
}


