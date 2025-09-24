package Review.Activity8;

public abstract class Document {

    public String title;

    public Document(String title) {
        this.title = title;
    }

    public abstract int pages();

}
