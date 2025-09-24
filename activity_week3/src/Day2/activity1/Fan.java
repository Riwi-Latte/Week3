package activity1;

public class Fan implements Operable {
    private String location;
    private boolean isRunning;
    
    public Fan(String location) {
        this.location = location;
        this.isRunning = false;
    }
    
    @Override
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(location + " fan started - Whoosh!");
        } else {
            System.out.println(location + " fan is already running");
        }
    }
    
    @Override
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println(location + " fan stopped - Silence");
        } else {
            System.out.println(location + " fan is already stopped");
        }
    }
}
