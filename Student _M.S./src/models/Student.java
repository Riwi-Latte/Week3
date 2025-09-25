package models;

import java.util.ArrayList;

public class Student extends Person {
    private String career;
    private int semester;
    private ArrayList<Double> notes;

    public Student(String id, String name, String email, int age, String career, int semester) {
        super(id, name, email, age);
        this.career = career;
        this.semester = semester;
        this.notes = new ArrayList<>();
    }


    public void addNote(ArrayList<Double> notes) {
        if (this.notes == null) {
            this.notes = new ArrayList<>(); 
        }
        
        for (Double note : notes) {
            if (note == null) {
                 System.out.println("Error: Se intentó agregar una nota nula. No se agregará.");
                 continue;
            }
            
            if (note < 0 || note > 100) {
                System.out.println("Error: La nota " + note + " no está en un rango válido (0-100). No se agregará.");
                continue; 
            } else {
                this.notes.add(note); 
            }
        }
    }

    public String getCareer() {
        return career;
    }


    public void setCareer(String career) {
        if (career == null) {
            System.out.println("Debes asignar una carrera valida");
            return;
        }
        this.career = career;
    }

    public static double calculateAverage(ArrayList<Double> notes) {
        if (notes == null || notes.isEmpty()) {
            System.out.println("Error: No hay notas para calcular el promedio");
            return 0.0;
        }
        double sum = 0.0;
        for (double note : notes) {
            sum += note;
        }
        return sum / notes.size();
    }


    public int getSemester() {
        return semester;
    }


    public void setSemester(int semester) {
        if (semester < 1 || semester > 12) {
            System.out.println("Error: El semestre debe estar entre 1 y 12");
            return;
        }
        this.semester = semester;
    }


    public ArrayList<Double> getNotes() {
        return new ArrayList<>(this.notes);
    }


    public double getAverage() {
        double myAverage = calculateAverage(this.notes);
        return myAverage;
    }

    public String toString(){
        return String.format("Nombre: %s, Carrera: %s, Semestre: %d, Promedio: %.2f", 
                             super.getName(), career, semester, getAverage());
    }
}