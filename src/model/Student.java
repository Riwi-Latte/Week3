package src.model;

public class Student extends Person {

    private String grade, course;

    public Student(String id, String name, String grade, String course) {

        super(id, name);
        setGrade(grade);
        setCourse(course);
    }

    public String getGrade() {
        return grade;
    }

    public String getCourse() {
        return course;
    }

    public void setGrade(String grade) {
        if (grade != null && !grade.trim().isEmpty()) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("\nEl grado no puede ir vacio");
        }
    }

    public void setCourse(String course) {
        if (course != null && !course.trim().isEmpty()) {
            this.course = course;
        } else {
            throw new IllegalArgumentException("\nEl curso no puede ir vacio");
        }
    }

    @Override
    public String toString() {
        return "Estudiante{id= " + getId() + ", Nombre= " + getName() + ", Curso= " + course
                + ", Grado= " + grade + "}";
    }

}
