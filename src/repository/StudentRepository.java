package src.repository;

import src.model.Student;
import java.util.ArrayList;

public interface StudentRepository {

    void save(Student student);

    Student findById(String id);

    void delete(String id);

    ArrayList<Student> findAll();

}
