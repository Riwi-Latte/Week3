package Review.Activity8;

public class Magazine extends Document {

    public int pagesPerEdition;

    public Magazine(String title, int pagesPerEdition) {
        super(title);
        this.pagesPerEdition = pagesPerEdition;
    }

    @Override
    public int pages() {
        return pagesPerEdition;
    }
}
