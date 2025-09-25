package service;

import repository.StudentRepo;

import java.util.ArrayList;

import models.Student;

public class StudentService{
    private StudentRepo repository;

    public StudentService(StudentRepo repository) {
        this.repository = repository;
    }

    public boolean createStudent(String id, String name, String email, int age, String career, int semester){
        if(id == null || name == null || email == null || age <= 0 || career == null || semester <= 0){
            System.out.println("Error: Datos invalidos para crear un estudiante.");
            return false;
        }
        if(repository.findById(id) != null){
            System.out.println("Error: Ya existe un estudiante con ID: " + id);
            return false;
        }
        repository.save(new Student(id, name, email, age, career, semester));
        return true;
    }


    public Student showStudentId(String id){

        if(id == null){
            System.out.println("Error: ID no puede ser vacio.");
            return null;
        }

        Student student = repository.findById(id);
        if(student != null){
            System.out.println(student);
        }else{
            System.out.println("Error: No se encontró un estudiante con ID: " + id);
        }
        return student;
    }


    public void deleteStudent(String id){

        if(id == null){
            System.out.println("Error: ID no puede estar vacio para eliminar un estudiante.");
            return;
        }
        repository.delete(id);
    }


    public void updateStudent(Student student){
        if(student == null || student.getId() == null){
            System.out.println("Error: Datos invalidos para actualizar un estudiante.");
            return;
        }
        repository.update(student);
    }


    public ArrayList<Student> showStudents(){
        ArrayList<Student> students = repository.findAll();
        return students;
    }


    public void addNotes(String id, ArrayList<Double> notes){
        if(id == null){
            System.out.println("Error: ID no puede estar vacio para agregar notas a un estudiante.");
            return;
        }
        Student student = repository.findById(id);
        if(student == null){
            System.out.println("Error: No se encontró un estudiante con ID: " + id);
            return;
        }
        student.addNote(notes);
        repository.update(student);
    }

}
