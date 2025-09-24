package activity9;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
     public static void main(String[] args) {
        String text = "hola mundo, esto es una PRUEBA.";

        ArrayList<Formatter> formatters = new ArrayList<>();
        formatters.add(new UpperCase());
        formatters.add(new LowerCase());
        formatters.add(new TitleCase());

        for (Formatter formatter : formatters) {
            String formattedText = formatter.format(text);
            
            System.out.println("Estrategia: " + formatter.getClass().getSimpleName());
            System.out.println("Texto formateado: " + formattedText);
            System.out.println();
        }
    }
}
