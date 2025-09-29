package Review.Activity14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("T1", "Fix bug in login", 5));
        tasks.add(new Task("T2", "Update documentation", 1));
        tasks.add(new Task("T3", "Implement new feature", 4));
        tasks.add(new Task("T4", "Code review", 2));
        tasks.add(new Task("T5", "Deploy to production", 5));
        tasks.add(new Task("T6", "Write unit tests", 3));

        ArrayList<Task> highPriorityTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.priority >= 3) {
                highPriorityTasks.add(task);
            }
        }

        Collections.sort(highPriorityTasks, new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return Integer.compare(t1.priority, t2.priority);
            }
        });

        System.out.println("\n" + "=== High Priority Tasks ===");
        for (Task task : highPriorityTasks) {
            System.out.println("\n" + task);
        }
    }
}
