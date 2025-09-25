package src.model;

public abstract class Person {

    private String id, name;

    public Person(String id, String name) {

        setId(id);
        setName(name);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {

        if (id != null && !id.trim().isEmpty()) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("\nEl ID no puede estar vacio");
        }
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("\nEl nombre no puede estar vacio");
        }
    }

    @Override
    public String toString() {
        return "Persona{id= " + id + ", Nombre= " + name + "}";
    }

}
