package activity10;

import java.util.HashMap;

public class Router {
    private HashMap<String, Runnable> routes;

    public Router() {
        this.routes = new HashMap<>();
    }

    public void addRoute(String path, Runnable action) {
        routes.put(path, action);
    }

    public void handleRequest(String path) {
        Runnable action = routes.get(path);

        if (action != null) {
            System.out.println("Manejando solicitud para: " + path);
            action.run();
        } else {
            System.out.println("Error 404: Ruta '" + path + "' no encontrada.");
        }
    }
}