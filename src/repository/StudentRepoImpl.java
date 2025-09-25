package src.repository;

import src.model.Student;
import java.util.HashMap;
import java.util.ArrayList;

public class StudentRepoImpl implements StudentRepository {

    private HashMap<String, Student> students = new HashMap<>();

    @Override
    public void save(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public Student findById(String id) {
        return students.get(id);
    }

    @Override
    public void delete(String id) {
        students.remove(id);
    }

    @Override
    public ArrayList<Student> findAll() {
        return new ArrayList<>(students.values());
    }

}
