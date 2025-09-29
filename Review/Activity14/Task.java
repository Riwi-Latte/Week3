package Review.Activity14;

public class Task {
    String id;
    String title;
    int priority;

    public Task(String id, String title, int priority) {
        this.id = id;
        this.title = title;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{id='" + id + "', title='" + title + "', priority=" + priority + "}";
    }
}