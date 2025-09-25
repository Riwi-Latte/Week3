package repository;

import java.util.ArrayList;
import java.util.HashMap;

import models.Student;

public class StudentRepo implements Repo<Student>{
    HashMap<String, Student> studentMap = new HashMap<>();

    @Override
    public void save(Student student) {
        if(student != null){
            studentMap.put(student.getId(), student);
            System.out.println("Estudiante guardado: " + student.getName());
        }else{
            System.out.println("Error: No se puede guardar un estudiante vacio.");
        }
    }

    @Override
    public Student findById(String id) {
        if(id != null && studentMap.containsKey(id)){
            return studentMap.get(id);
        }else{
            System.out.println("Error: No se encontró un estudiante con ID: " + id);
            return null;
        }
    }


    @Override
    public void delete(String id) {
        if(id != null && studentMap.containsKey(id)){
            Student removed = studentMap.remove(id);
            System.out.println("Estudiante eliminado: " + removed.getName());
        }else{
            System.out.println("Error: No se encontró un estudiante con ID: " + id);
        }
    }


    @Override
    public ArrayList<Student> findAll() {
        if(studentMap.isEmpty()){
            System.out.println("No hay estudiantes registrados.");
            return null;
        }
        return new ArrayList<>(studentMap.values());
    }
    

    @Override
    public void update(Student student) {
        if(student != null && studentMap.containsKey(student.getId())){
            studentMap.put(student.getId(), student);
            System.out.println("Estudiante actualizado: " + student.getName());
        }else{
            System.out.println("Error: No se puede actualizar un estudiante que no existe.");
        }
    }
    
}
