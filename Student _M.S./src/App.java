import javax.swing.JOptionPane;

import repository.StudentRepo;
import service.StudentService;
import models.Student;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static final String MENU = """
            ========================================
            |   SISTEMA DE GESTIÓN DE ESTUDIANTES  |
            ========================================
             1. Crear nuevo estudiante            
             2. Ingresar notas de estudiante                  
             3. Mostrar estudiante por ID         
             4. Eliminar estudiante               
             5. Actualizar estudiante             
             6. Mostrar TODOS los estudiantes     
             7. Salir                             
            ========================================
            """;

    static StudentRepo repo = new StudentRepo();
    static StudentService service = new StudentService(repo);

    public static void main(String... args) throws Exception {


        String option = showMenu();

        do {
            switch (option) {
                case "1":
                    studentCreate();
                    option = showMenu();
                    break;
                case "2":
                    notesStudent();
                    option = showMenu();
                    break;
                case "3":
                    showStudentById();
                    option = showMenu();
                    break;
                case "4":
                    deleteStudent();
                    option = showMenu();
                    break;
                case "5":
                    updateStudent();
                    option = showMenu();
                    break;
                case "6":
                    ShowAllStudents();
                    option = showMenu();
                    break;
                case "7":
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    break;
            }
        } while (!option.equals("7"));

    }

    private static String showMenu() {
        return JOptionPane.showInputDialog(MENU + "Seleccione una opción (1-6):");

    }

    private static void studentCreate() {
        try {
            String id = JOptionPane.showInputDialog("Ingresa el ID del estudiante:");
            if (id == null || id.trim().isEmpty()) {
                System.out.println("Error: ID no puede estar vacio para crear un estudiante.");
                return;
            }

            String name = JOptionPane.showInputDialog("Ingresa el nombre del estudiante:");
            if (name == null || name.trim().isEmpty()) {
                System.out.println("Error: Nombre no puede estar vacio para crear un estudiante.");
                return;
            }

            String email = JOptionPane.showInputDialog("Ingresa el email del estudiante:");
            if (email == null || email.trim().isEmpty()) {
                System.out.println("Error: Email no puede estar vacio para crear un estudiante.");
                return;
            }

            int age = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante:"));
            if (age <= 0) {
                System.out.println("Error: Edad debe ser un numero positivo para crear un estudiante.");
                return;
            }

            String career = JOptionPane.showInputDialog("Ingresa la carrera del estudiante:");
            if (career == null || career.trim().isEmpty()) {
                System.out.println("Error: Carrera no puede estar vacio para crear un estudiante.");
                return;
            }

            int semester = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el semestre del estudiante:"));
            if (semester <= 0) {
                System.out.println("Error: Semestre debe ser un numero positivo para crear un estudiante.");
                return;
            }

            service.createStudent(id, name, email, age, career, semester);

        } catch (Exception e) {
        }
    }

    private static void notesStudent() {

        String id = JOptionPane.showInputDialog("Ingresa el ID del estudiante para agregar notas:");
        if (id == null || id.trim().isEmpty()) {
            System.out.println("Error: ID no puede estar vacío.");
            return;
        }
    
        String input;
        List<Double> newNotes = new ArrayList<>();
        
        boolean inputSuccessful = true;
    
        do {
            input = JOptionPane.showInputDialog(
                    "Ingresa la nota a agregar (0-100) para el estudiante " + id +
                    " (Notas recolectadas: " + newNotes.size() + ")" + 
                    " o presiona CANCELAR para terminar:");
    
            if (input == null) {
                break; 
            }
    
            try {
                double note = Double.parseDouble(input.trim());
                
                if (note < 0 || note > 100) {
                    JOptionPane.showMessageDialog(null, 
                        "Error: La nota debe estar entre 0 y 100.", 
                        "Error de Rango", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                
                newNotes.add(note);
                
                System.out.println("Nota " + note + " recolectada. Continúa o Cancelar.");
    
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, 
                    "Error: Ingresa un valor numérico válido.", 
                    "Error de Formato", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                System.out.println("Error inesperado durante el ingreso de notas. Detalle: " + e.getMessage());
                inputSuccessful = false;
            }
    
        } while (inputSuccessful);
    
        if (!newNotes.isEmpty() && inputSuccessful) {
            try {
                service.addNotes(id, new ArrayList<>(newNotes));
                JOptionPane.showMessageDialog(null, newNotes.size() + " notas agregadas exitosamente al estudiante " + id + ".", "Éxito", JOptionPane.INFORMATION_MESSAGE);
           
            } catch (Exception e) {
                System.out.println("Error: El servicio falló al guardar las notas. Detalle: " + e.getMessage());
            
            }
        } else if (newNotes.isEmpty() && inputSuccessful && id != null) {
             System.out.println("No se ingresaron notas para el estudiante " + id + ".");
        }
    }


    private static void showStudentById() {
        String id = JOptionPane.showInputDialog("Ingresa el ID del estudiante a buscar:");
        if (id == null || id.trim().isEmpty()) {
            System.out.println("Error: ID no puede estar vacio para buscar un estudiante.");
            return;
        }
        Student student = service.showStudentId(id);
        if (student != null) {
            JOptionPane.showMessageDialog(null, student, "Detalles del Estudiante", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error: No se encontró un estudiante con ID: " + id, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void deleteStudent() {
        String id = JOptionPane.showInputDialog("Ingresa el ID del estudiante a eliminar:");
        if (id == null || id.trim().isEmpty()) {
            System.out.println("Error: ID no puede estar vacio para eliminar un estudiante.");
            return;
        }
        service.deleteStudent(id);
    }

    private static void updateStudent() {

        String id = JOptionPane.showInputDialog("Ingresa el ID del estudiante a actualizar:");
        if (id == null || id.trim().isEmpty()) {
            System.out.println("Error: ID no puede estar vacío para actualizar un estudiante.");
            return;
        }

        Student existingStudent = service.showStudentId(id);

        if (existingStudent == null) {
            JOptionPane.showMessageDialog(null, "Error: Estudiante con ID " + id + " no encontrado.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String option;
        boolean continueUpdating = true;

        while (continueUpdating) {

            String optionMenu = String.format(
                    "Selecciona el campo a actualizar (Estudiante: %s):\n" +
                            "1. Nombre (Actual: %s)\n" +
                            "2. Email (Actual: %s)\n" +
                            "3. Edad (Actual: %d)\n" +
                            "4. Carrera (Actual: %s)\n" +
                            "5. Semestre (Actual: %d)\n" +
                            "6. Guardar Cambios y Salir",
                    existingStudent.getId(),
                    existingStudent.getName(),
                    existingStudent.getEmail(),
                    existingStudent.getBirthday(),
                    existingStudent.getCareer(),
                    existingStudent.getSemester());

            option = JOptionPane.showInputDialog(optionMenu);
            if (option == null) {
                continueUpdating = false;
                break;
            }

            try {
                switch (option.trim()) {
                    case "1":
                        String newName = JOptionPane
                                .showInputDialog("Ingresa el nuevo Nombre (o déjalo vacío para no cambiar):");
                        if (newName != null && !newName.trim().isEmpty()) {
                            existingStudent.setName(newName.trim());
                        }
                        break;
                    case "2":
                        String newEmail = JOptionPane
                                .showInputDialog("Ingresa el nuevo Email (o déjalo vacío para no cambiar):");
                        if (newEmail != null && !newEmail.trim().isEmpty()) {
                            existingStudent.setEmail(newEmail.trim());
                        }
                        break;
                    case "3":
                        String ageInput = JOptionPane
                                .showInputDialog("Ingresa la nueva Edad (o déjalo vacío para no cambiar):");
                        if (ageInput != null && !ageInput.trim().isEmpty()) {
                            int newAge = Integer.parseInt(ageInput.trim());
                            if (newAge <= 0) {
                                System.out.println("Error: Edad debe ser un numero positivo.");
                                break;
                            }
                            existingStudent.setAge(newAge);
                        }
                        break;
                    case "4":
                        String newCareer = JOptionPane
                                .showInputDialog("Ingresa la nueva Carrera (o déjalo vacío para no cambiar):");
                        if (newCareer != null && !newCareer.trim().isEmpty()) {
                            existingStudent.setCareer(newCareer.trim());
                        }
                        break;
                    case "5":
                        String semesterInput = JOptionPane
                                .showInputDialog("Ingresa el nuevo Semestre (o déjalo vacío para no cambiar):");
                        if (semesterInput != null && !semesterInput.trim().isEmpty()) {
                            int newSemester = Integer.parseInt(semesterInput.trim());
                            if (newSemester <= 0) {
                                System.out.println("Error: Semestre debe ser un numero positivo.");
                                break;
                            }
                            existingStudent.setSemester(newSemester);
                        }
                        break;
                    case "6":
                        service.updateStudent(existingStudent);
                        JOptionPane.showMessageDialog(null, "Estudiante " + id + " actualizado exitosamente.", "Éxito",
                                JOptionPane.INFORMATION_MESSAGE);
                        continueUpdating = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error de formato: Ingresa un número válido para edad o semestre.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Error de validación: " + e.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar: " + e.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);
                continueUpdating = false;
            }
        }
    }

    private static void ShowAllStudents() {
        ArrayList<Student> students = service.showStudents();
        if (students == null || students.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay estudiantes registrados.", "Información",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        for (Student student : students) {
            JOptionPane.showMessageDialog(null, student, "Detalles del Estudiante", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
