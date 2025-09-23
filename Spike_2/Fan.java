package Spike_2;

public class Fan implements Operable {

    private String name;

    public Fan(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void start(){
        System.out.println("Start Fan");
    }

    public void stop(){
        System.out.println("Stop Fan");
    }
}
