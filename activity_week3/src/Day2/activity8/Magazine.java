package activity8;

public class Magazine extends Document {
    private int pagesForEdition;
    private int numberOfEditions;

    public Magazine(String title, int pagesForEdition, int numberOfEditions) {
        super(title);
        this.pagesForEdition = pagesForEdition;
        this.numberOfEditions = numberOfEditions;
    }

    @Override
    public int pages() {
        return this.pagesForEdition * this.numberOfEditions;
    }
    
}
