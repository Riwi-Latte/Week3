import java.util.HashMap;

public class Agenda {
    private HashMap<String, String> myAgenda = new HashMap<>();



    public Agenda (HashMap<String, String> myAgenda) {
        this.myAgenda = myAgenda;
    }

    public HashMap<String, String> getAgenda() {
        return myAgenda;
    }

    public void setAgenda(HashMap<String, String> myAgenda) {
        this.myAgenda.keySet();
        this.myAgenda.entrySet();
    }
}