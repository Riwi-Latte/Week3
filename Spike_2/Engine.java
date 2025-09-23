package Spike_2;

public class Engine implements Operable{
    
    private String name;

    public Engine(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void start(){
        System.out.println("Start Engine");
    }

    public void stop(){
        System.out.println("Stop Engine");
    }
}
