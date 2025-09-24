package activity13;


import java.util.HashMap;

public class StudentRepo implements Repo<Student> {
    private HashMap<String, Student> students = new HashMap<>();

    @Override
    public void save(Student student) {
        if (student == null || student.getId() == null || student.getId().isEmpty()) {
            System.out.println("Datos de estudiante no válidos. No se pueden guardar.");
            return;
            
        }
        students.put(student.getId(), student);
        System.out.println("Estudiante guardado: " + student.getId());
    }

    @Override
    public Student findById(String id) {
        if (!students.containsKey(id)) {
            System.out.println("Estudiante con id " + id + " no encontrado.");
            return null;
        }
        return students.get(id);
    }

    @Override
    public void delete(String id) {
        if (students.remove(id) != null) {
            System.out.println("Estudiante eliminado con id: " + id);
        } else {
            System.out.println("Estudiante con id " + id + " no encontrado.");
        }
    }

    public void listAllStudents() {
        System.out.println("Alumnos actuales en repositorio:");
        if (students.isEmpty()) {
            System.out.println("  (Vacío)");
        }
        for (Student student : students.values()) {
            System.out.println("  - " + student.getName() + " (ID: " + student.getId() + ")");
        }
    }
}
