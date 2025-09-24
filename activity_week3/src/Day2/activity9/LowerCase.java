package activity9;

public class LowerCase implements Formatter {
    @Override
    public String format(String s){
        if(s == null || s.isEmpty()){
            return s;
        }
        return s.toLowerCase();
    }
}
