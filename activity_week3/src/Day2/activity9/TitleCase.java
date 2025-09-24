package activity9;

public class TitleCase implements Formatter {
    @Override
    public String format(String s){
        if(s == null || s.isEmpty()){
            return s;
        }
        char letter = s.charAt(0);
        StringBuilder titleCase = new StringBuilder();
        titleCase.append(Character.toUpperCase(letter));
        titleCase.append(s.substring(1).toLowerCase());
        return titleCase.toString();
    }
}
