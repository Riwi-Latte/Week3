package activity13;

public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            System.out.println("El nombre no puede ser nulo o vacío.");
            return;
        }
        this.name = name;
    }

}