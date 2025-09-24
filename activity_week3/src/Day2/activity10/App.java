package activity10;

public class App {
    public static void main(String[] args) {
        Router router = new Router();

        router.addRoute("/home", () -> System.out.println("Bienvenido a la página de inicio."));
        router.addRoute("/about", () -> System.out.println("Conoce más sobre nosotros."));
        router.addRoute("/contact", () -> System.out.println("Contáctanos para más información."));

        System.out.println("\n--- Simulación de peticiones ---\n");
        
        router.handleRequest("/home");

        System.out.println();
        
        router.handleRequest("/contact");

        System.out.println();
        
        router.handleRequest("/services");

        System.out.println();

        router.handleRequest("/login");
    }
}
