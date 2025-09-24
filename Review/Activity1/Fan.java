package Review.Activity1;

public class Fan implements Operable {

    @Override
    public void start() {
        System.out.println("\nArranco el ventilador");

    }

    @Override
    public void stop() {
        System.out.println("\nParo el ventilador");

    }
}
