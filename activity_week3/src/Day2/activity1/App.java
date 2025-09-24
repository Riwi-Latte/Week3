package activity1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String... args) {
      
        // Acivity 1: Interfaces
        List<Operable> operableDevices = new ArrayList<>();

        Engine carEngine = new Engine("Car");
        Engine motorcycleEngine = new Engine("Motorcycle");
        Fan ceilingFan = new Fan("Ceiling");
        Fan desktopFan = new Fan("Desktop");

        operableDevices.add(carEngine);
        operableDevices.add(motorcycleEngine);
        operableDevices.add(ceilingFan);
        operableDevices.add(desktopFan);

        for (Operable device : operableDevices) {
            device.start();
            device.stop();
            System.out.println();
        }
    }
}
