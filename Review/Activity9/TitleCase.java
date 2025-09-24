package Review.Activity9;

public class TitleCase implements Formatter {

    @Override
    public String format(String s) {

        StringBuilder sb = new StringBuilder();

        for (String word : s.split(" ")) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase()).append(" ");

            }
        }
        return sb.toString().trim();
    }
}
