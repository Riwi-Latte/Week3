package activity13;

public class App {
    public static void main(String[] args) {

        StudentRepo studentRepo = new StudentRepo();

        System.out.println("--- Guardando estudiantes---");
        studentRepo.save(new Student("001", "Ana Gomez"));
        studentRepo.save(new Student("002", "Yeferson Garcia"));
        studentRepo.save(new Student("003", "Mariana Lopez"));

        studentRepo.listAllStudents();

        System.out.println("\n--- Encontrar estudiantes por ID '002' ---");
        Student foundStudent = studentRepo.findById("007");
        if (foundStudent != null) {
            System.out.println("Encontrado: " + foundStudent.getName());
        }

        System.out.println("\n--- Eliminar estudiante con ID '001' ---");
        studentRepo.delete("001");

        System.out.println("\n--- Listado de estudiantes después de la eliminación---");
        studentRepo.listAllStudents();
    }
}
