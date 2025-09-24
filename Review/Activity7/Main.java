package Review.Activity7;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n========== Activity 7 – Interface + HashMap =========\n");

        HashMap<String, User> users = new HashMap<>();

        User u1 = new User("1", "Camilo");
        User u2 = new User("2", "Paula");
        User u3 = new User("3", "Felipe");
        User u4 = new User("4", "Lorena");
        User u5 = new User("5", "Sofia");

        users.put(u1.key(), u1);
        users.put(u2.key(), u2);
        users.put(u3.key(), u3);
        users.put(u4.key(), u4);
        users.put(u5.key(), u5);

        System.out.println("found: " + users.get("1").name);
        System.out.println("Update: " + (users.get("1").name = "Pedro"));
        System.out.println("Delete: " + users.remove("1").name);

    }
}
