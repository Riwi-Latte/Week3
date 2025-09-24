package activity7;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        
        //Activity 7 – Interface + HashMap
        HashMap<String, User> userMap = new HashMap<>();

        User user1 = new User("user_001", "Alice");
        User user2 = new User("user_002", "Bob");
        User user3 = new User("user_003", "Charlie");

        userMap.put(user1.key(), user1);
        userMap.put(user2.key(), user2);
        userMap.put(user3.key(), user3);


        String userIdToFind = "user_002";
        User foundUser = userMap.get(userIdToFind);
        if (foundUser != null) {
            System.out.println("\nUsuario encontrado con ID '" + userIdToFind + "': " + foundUser.getName());
        } else {
            System.out.println("\nUsuario con ID '" + userIdToFind + "' no encontrado.");
        }
        
        String userIdToUpdate = "user_001";
        User userToUpdate = userMap.get(userIdToUpdate);
        if (userToUpdate != null) {
            userToUpdate.setName("Alicia Smith");
            System.out.println("\nNombre de usuario actualizado:");
            System.out.println("Usuario actualizado: " + userToUpdate.getName());
        }

        String userIdToRemove = "user_003";
        userMap.remove(userIdToRemove);
        System.out.println("\nUsuario con ID '" + userIdToRemove + "' ha sido eliminado.");

    }
}
