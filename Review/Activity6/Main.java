package Review.Activity6;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n========== Activity 6 – Index with HashMap =========\n");

        ArrayList<String> words = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        words.add("Java");
        words.add("Java");
        words.add("Python");
        words.add("C");
        words.add("C");
        words.add("Java");
        words.add("Java");
        words.add("Java");

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}