package src.Models;

import java.util.ArrayList;

public interface Repository {
    
    public default void addStudent(ArrayList<Student> students,Student student){
        
        Boolean foundStudent = false;

        for (Student studentItem : students) {
            
            if (studentItem.getDocument().equals(student.getDocument()) && studentItem.getId().equals(student.getId())) {
                foundStudent = true;
                return;
            }           
        }
        if (foundStudent){
            System.out.println("El documento o el id no puede ser igual al de otros estudiantes");
            return;
        }
        students.add(student);
        System.out.println("Estudiante agregado");

    };

    public default void deleteStudent(ArrayList<Student> students,String id){

        Boolean flagStudent = false;

        for (Student student : students) {
            if (student.getId().equals(id)) {
                flagStudent = true;
                students.remove(student);
                System.out.println("Estudiante eliminado");
                break;
            }
        }
        if (!flagStudent) {
            System.out.println("No se encontro el estudiante");
        }

    };

    public default void showStudents(ArrayList<Student> students){

        if (students.size() == 0) {
            System.out.println("No hay estudiantes registrados");
            return;
        }

        for (Student student : students) {
            System.out.println("Id: " + student.getId() + ", Documento: " + student.getDocument() + ", Nombre: " + student.getName() + ", Grado: " + student.getGrade());
        }

    };
}
