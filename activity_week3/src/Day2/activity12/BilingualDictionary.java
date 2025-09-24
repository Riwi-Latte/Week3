package activity12;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class BilingualDictionary {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> dictionary = new HashMap<>();

        ArrayList<String> translations_casa = new ArrayList<>();
        translations_casa.add("house");
        translations_casa.add("home");
        dictionary.put("casa", translations_casa);

        ArrayList<String> translations_perro = new ArrayList<>();
        translations_perro.add("dog");
        dictionary.put("perro", translations_perro);

        ArrayList<String> translations_libro = new ArrayList<>();
        translations_libro.add("book");
        translations_libro.add("manual");
        dictionary.put("libro", translations_libro);

        ArrayList<String> existingTranslations = dictionary.get("perro");
        if (existingTranslations != null) {
            existingTranslations.add("puppy");
        }

        System.out.println("\nDiccionario Bilingüe:");
        System.out.println("--------------------");

        for (Map.Entry<String, ArrayList<String>> entry : dictionary.entrySet()) {
            String spanishWord = entry.getKey();
            ArrayList<String> translations = entry.getValue();

            System.out.print(spanishWord + ": ");

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
