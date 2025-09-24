package activity8;

public abstract class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public abstract int pages();
}