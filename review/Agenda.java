import java.util.HashMap;

public class Agenda {

    private HashMap<String, String> agenda = new HashMap<>();

    public void addAgenda(String name, String phone) {
        agenda.put(name, phone);
    }

    public String get(String name) {
        return agenda.get(name);
    }


}
