package activity6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        // Activity 6 – Index with HashMap
        HashMap<String, Integer> wordCounter = new HashMap<>();
        ArrayList<String> wordList = new ArrayList<>();

        String[] words = { "Python", "Java", " JavaScript", "Python", "Java", " JavaScript", "TypeScript", "PHP",
                "Ruby",
                "TypeScript", "Java", "Python", "C#", "C++", "Ruby", "JavaScript", "PHP", "C++", "C#", "Java" };
        for (String word : words) {
            wordList.add(word);
        }

        for (String word : wordList) {
            if (wordCounter.containsKey(word)) {
                int currentCount = wordCounter.get(word);
                wordCounter.put(word, currentCount + 1);
            } else {
                wordCounter.put(word, 1);
            }
        }

        System.out.println();
        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();

            if (count > 2) {
                System.out.println(word + " - " + count + "*");
            } else {
                System.out.println(word + " - " + count);
            }
        }

    }
}
