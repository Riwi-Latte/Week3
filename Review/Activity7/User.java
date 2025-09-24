package Review.Activity7;

public class User implements Storable {

    public String id, name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String key() {
        return id;
    }
}
