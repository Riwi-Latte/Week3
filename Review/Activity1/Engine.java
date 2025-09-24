package Review.Activity1;

public class Engine implements Operable {

    @Override
    public void start() {
        System.out.println("\nArranco el motor");

    }

    @Override
    public void stop() {
        System.out.println("\nParo el motor");

    }
}
