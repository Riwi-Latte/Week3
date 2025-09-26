package src.Models;

public abstract class Person {
    
    private String document;
    private String name;
    private int age;
    private String gender;

    public Person(String document, String name, int age, String gender){

        this.document = document;
        this.name = name;
        this.age = age;
        this.gender = gender;   
    };

    public String getDocument() {
        return document;
    };
    public String getName() {
        return name;
    };
    public int getAge() {
        return age;
    };
    public String getGender() {
        return gender;
    };  

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("La edad no puede ser negativa");
            return;
        } else if (age > 120) {
            System.out.println("La edad no puede ser mayor a 120");
            return;
        }
        this.age = age;
    };

}
