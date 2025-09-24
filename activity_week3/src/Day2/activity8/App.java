package activity8;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // Activity 8 – Abstract + filter with ArrayList
        ArrayList<activity8.Document> documents = new ArrayList<>();
        documents.add(new activity8.Book("The Great Gatsby", 180));
        documents.add(new activity8.Magazine("National Geographic", 50, 12));
        documents.add(new activity8.Book("1984", 328));
        documents.add(new activity8.Magazine("Time", 40, 10));
        documents.add(new activity8.Book("To Kill a Mockingbird", 281));
        documents.add(new activity8.Magazine("Forbes", 60, 8));

        for (Document pages : documents) {
            if (pages.pages() >= 100) {
                System.out.println("Titulo: " + pages.getTitle() + " - Paginas: " + pages.pages());
            }
        }
    }
}
