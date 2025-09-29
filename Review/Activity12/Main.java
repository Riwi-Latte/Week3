package Review.Activity12;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> dictionary = new HashMap<>();

        ArrayList<String> houseTranslations = new ArrayList<>();
        houseTranslations.add("house");
        houseTranslations.add("home");
        houseTranslations.add("dwelling");
        dictionary.put("casa", houseTranslations);

        ArrayList<String> carTranslations = new ArrayList<>();
        carTranslations.add("car");
        carTranslations.add("automobile");
        dictionary.put("carro", carTranslations);

        ArrayList<String> bookTranslations = new ArrayList<>();
        bookTranslations.add("book");
        bookTranslations.add("volume");
        bookTranslations.add("tome");
        dictionary.put("libro", bookTranslations);

        dictionary.get("casa").add("residence");

        System.out.println("\n" + "=== Bilingual Dictionary ===");
        for (String word : dictionary.keySet()) {
            System.out.print("\n" + word + ": ");
            ArrayList<String> translations = dictionary.get(word);
            for (int i = 0; i < translations.size(); i++) {
                System.out.print(translations.get(i));
                if (i < translations.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
