package activity10;

public class App {
    public static void main(String[] args) {
        Router router = new Router();

        router.addRoute("/home", () -> System.out.println("Bienvenido a la página de inicio.\n"));
        router.addRoute("/about", () -> System.out.println("Conoce más sobre nosotros.\n"));
        router.addRoute("/contact", () -> System.out.println("Contáctanos para más información.\n"));

        System.out.println("\n--- Simulación de peticiones ---\n");
        
        router.handleRequest("/home");

        router.handleRequest("/contact");

        router.handleRequest("/services");

        router.handleRequest("/login");
    }
}
