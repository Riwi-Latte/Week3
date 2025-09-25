package models;

public abstract class Person {
    private String name;
    private String id;
    private String email;
    private int age;

    public Person(String name, String id, String email, int age) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public int getBirthday() {
        return age;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío.");
            return;
        }

        this.name = name;
    }

    public void setId(String id) {
        if (id == null || id.isEmpty()) {
            System.out.println("Error: El ID no puede estar vacío.");
            return;
        }

        this.id = id;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            System.out.println("Error: Email inválido.");
            return;
        }

        this.email = email;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Error: La edad no puede ser negativa.");
            return;
        }
        this.age = age;
    }
}