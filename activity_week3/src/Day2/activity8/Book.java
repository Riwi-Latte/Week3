package activity8;

public class Book extends Document {
    private int numberOfPages;

    public Book(String title, int numberOfPages) {
        super(title);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public int pages() {
        return numberOfPages;
    }
}
