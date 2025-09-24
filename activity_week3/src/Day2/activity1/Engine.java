package activity1;

public class Engine implements Operable {
    private String type;
    private boolean isRunning;
    
    public Engine(String type) {
        this.type = type;
        this.isRunning = false;
    }
    
    @Override
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(type + " engine started - VROOM!");
        } else {
            System.out.println(type + " engine is already running");
        }
    }
    
    @Override
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println(type + " engine stopped");
        } else {
            System.out.println(type + " engine is already stopped");
        }
    }
}