package Review.Activity8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Document> documents = new ArrayList<>();

        documents.add(new Magazine("El hombre en busca de sentido", 200));
        documents.add(new Book("Cancien de hielo y fuego", 400));
        documents.add(new Magazine("Noches blancas", 150));
        documents.add(new Book("Hermanoz kamarazon", 400));

        System.out.println("\nLibros con mas de 100 paginas son: \n");
        for (Document document : documents) {
            if (document.pages() >= 100) {
                System.out.println(document.title + " Con " + document.pages() + " Paginas");
            }
        }

    }
}
