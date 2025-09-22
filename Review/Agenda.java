package Review;

import java.util.HashMap;

public class Agenda {

    HashMap<String,String> agenda = new HashMap<>();

    public Agenda(HashMap<String,String> agenda){
        this.agenda = agenda;
    }

    public HashMap<String,String> getHashMap(){
        return agenda;
    }


}