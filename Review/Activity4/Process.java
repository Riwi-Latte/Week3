package Review.Activity4;

public abstract class Process {

    public final void execute() {
        prepare();
        process();
        finish();
    }

    public abstract void prepare();

    public abstract void process();

    public void finish() {
        System.out.println("\nMelo");
    }
}
