package activity4;

public abstract class Process {

    public final void execute() {
        prepare();
        process();
        finish();
    }

    protected abstract void prepare();
    protected abstract void process();

    protected void finish() {
        System.out.println("Proceso finalizado: OK");
    }
}
