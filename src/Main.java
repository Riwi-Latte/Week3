package src;

import javax.swing.JOptionPane;
import src.model.Student;
import src.repository.StudentRepoImpl;
import src.repository.StudentRepository;

public class Main {

    private static StudentRepository repo = new StudentRepoImpl();

    public static void main(String[] args) {
        String option;

        do {
            option = showMenu();

            switch (option) {
                case "1":
                    createStudent();
                    break;
                case "2":
                    findStudent();
                    break;
                case "3":
                    listAllStudents();
                    break;
                case "4":
                    deleteStudent();
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "\nHasta luego!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
            }

        } while (!option.equals("5"));
    }

    private static String showMenu() {
        return JOptionPane.showInputDialog(
                "=== SISTEMA DE GESTION DE ESTUDIANTES ===\n\n\n" + "1. Crear estudiante\n"
                        + "2. Buscar estudiante por ID\n" + "3. Listar todos los estudiantes\n"
                        + "4. Eliminar estudiante\n" + "5. Salir\n\n" + "Elige una opcion:");
    }

    private static void createStudent() {
        try {
            String id;

            do {
                id = JOptionPane.showInputDialog("Ingresa el ID del estudiante:");

                if (id == null)
                    return;
                if (id.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: el ID no puede estar vacio",
                            "ERROR ID", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                if (repo.findById(id) != null) {
                    JOptionPane.showMessageDialog(null,
                            "ERROR: ya  existe un estudiante con el ID: " + id, "ERROR ID",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                break;
            } while (true);

            String name;

            do {
                name = JOptionPane.showInputDialog("Ingresa el nombre del estudiante:");

                if (name == null)
                    return;
                if (!name.trim().isEmpty())
                    break;

                JOptionPane.showMessageDialog(null,
                        "ERROR: el nombre del estudiante no puede estar vacio", "ERROR NOMBRE",
                        JOptionPane.ERROR_MESSAGE);
            } while (true);


            String grade;
            do {
                grade = JOptionPane.showInputDialog("Ingresa el grado del estudiante:");

                if (grade == null)
                    return;
                if (!grade.trim().isEmpty())
                    break;

                JOptionPane.showMessageDialog(null,
                        "ERROR: el grado el estudiante no puede estar vacio", "ERROR GRADO",
                        JOptionPane.ERROR_MESSAGE);

            } while (true);



            String course;
            do {
                course = JOptionPane.showInputDialog("Ingresa el curso del estudiante:");

                if (course == null)
                    return;
                if (!course.trim().isEmpty())
                    break;

                JOptionPane.showMessageDialog(null,
                        "ERROR: el curso del estudiante no puede estar vacio", "ERROR CURSO",
                        JOptionPane.ERROR_MESSAGE);

            } while (true);


            Student student = new Student(id, name, grade, course);
            repo.save(student);

            JOptionPane.showMessageDialog(null,
                    "Estudiante creado exitosamente!\n" + student.toString());

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
    }

    private static void findStudent() {
        String id = JOptionPane.showInputDialog("Ingresa el ID del estudiante a buscar:");
        Student student = repo.findById(id);

        if (student != null) {
            JOptionPane.showMessageDialog(null, "Estudiante encontrado:\n" + student.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro un estudiante con ID: " + id);
        }
    }

    private static void listAllStudents() {
        java.util.ArrayList<Student> students = repo.findAll();

        if (students.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay estudiantes registrados");
        } else {
            StringBuilder message = new StringBuilder("Lista de estudiantes:\n\n");
            for (Student student : students) {
                message.append(student.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, message.toString());
        }
    }

    private static void deleteStudent() {
        String id = JOptionPane.showInputDialog("Ingresa el ID del estudiante a eliminar:");
        Student student = repo.findById(id);

        if (student != null) {
            repo.delete(id);
            JOptionPane.showMessageDialog(null, "Estudiante eliminado:\n" + student.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro un estudiante con ID: " + id);
        }
    }
}
