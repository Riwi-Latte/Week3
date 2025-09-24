package Review.Activity10;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Runnable> router = new HashMap<>();

        router.put("/home", () -> System.out.println("Welcome\n"));
        router.put("/about", () -> System.out.println("About\n"));
        router.put("/contact", () -> System.out.println("Contact"));

        String[] requests = {"/home", "/about", "/notfound"};

        for (String path : requests) {
            Runnable action = router.get(path);
            if (action != null) {
                action.run();
            } else {
                System.out.println("404 not found");
            }
        }

    }
}
