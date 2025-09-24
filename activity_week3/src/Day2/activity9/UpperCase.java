package activity9;

public class UpperCase implements Formatter {
    @Override
    public String format(String s){
        if(s == null || s.isEmpty()){
            return s;
        }
        return s.toUpperCase();
    }
}
