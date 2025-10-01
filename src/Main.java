package src;

import java.util.ArrayList;

import src.Models.Student;


public class Main {
    
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        
        Student student1 = new Student("120352598", "isa", 23, "femenino", "sm002", "11.2");
        Student student2 = new Student("120352599", "adrian", 25, "masculino", "sm003", "11.3");
        Student student3 = new Student("120352600", "laura", 22, "femenino", "sm004", "11.4");

        student1.addStudent(students, student1);
        student2.addStudent(students, student2);
        student3.addStudent(students, student3);

        student1.deleteStudent(students, "sm003");
        student1.deleteStudent(students, "sm008");
        
        System.out.println("\nLista de estudiantes:");
        student1.showStudents(students);
    }

}
