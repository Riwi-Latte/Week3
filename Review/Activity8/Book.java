package Review.Activity8;

public class Book extends Document {

    public int totalPages;

    public Book(String title, int totalPages) {
        super(title);
        this.totalPages = totalPages;
    }

    @Override
    public int pages() {
        return totalPages;
    }
}
