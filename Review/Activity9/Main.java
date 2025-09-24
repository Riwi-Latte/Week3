package Review.Activity9;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Formatter> formatters = new ArrayList<>();

        formatters.add(new UpperCase());
        formatters.add(new LowerCase());
        formatters.add(new TitleCase());

        String text = "Java es lo mejor";

        for (Formatter formatter : formatters) {
            System.out.println("\n" + formatter.format(text));
        }

    }


}
