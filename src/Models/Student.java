package src.Models;

import java.util.ArrayList;

public class Student extends Person{
    
    String id;
    String grade;
    ArrayList<Double> notes;

    public Student(String document, String name, int age, String gender, String id, String grade) {
        super(document, name, age, gender);
        this.id = id;
        this.grade = grade;
        this.notes = new ArrayList<>();
    };

    public String getId() {
        return id;
    };
    public String getGrade() {
        return grade;
    };
    public ArrayList<Double> getNotes() {
        return notes;
    };
    public void addNote(double note) {
        if (note < 0 || note > 5) {
            System.out.println("La nota debe estar entre 0 y 5");
            return;
        }
        this.notes.add(note);
    };
    public void setGrade(String grade) {
        if (grade == null || grade.isEmpty()) {
            System.out.println("El grado no puede estar vacio");
            return;
        } else if (grade.length() > 4) {
            System.out.println("El grado no puede tener mas de 4 caracteres");
            return;
        } 
        this.grade = grade;
    };
    
    
    public String ShowStudent() {
        return "Student - Id: " + id + ", Grade: " + grade + ", Notes: " + notes + ", Document: " + getDocument() + ", Name: " + getName()
                + ", Age: " + getAge() + ", Gender: " + getGender() + "-";
    
    }

}
