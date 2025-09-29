package Review.Activity13;

public class Main {
    public static void main(String[] args) {

        StudentRepo repo = new StudentRepo();

        repo.save(new Student("S001", "Carlos"));
        repo.save(new Student("S002", "Maria"));
        repo.save(new Student("S003", "Luis"));

        System.out.println("\n" + "Student found by ID S002: " + repo.findById("S002"));

        repo.delete("S001");

        repo.listAll();
    }
}
