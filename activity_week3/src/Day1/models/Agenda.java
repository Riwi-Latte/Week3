package Day1.models;
import java.util.HashMap;

public class Agenda {
    private HashMap<String, String> contact;
    
    public Agenda() {
        contact = new HashMap<String, String>();
    }
    
    public void agregarContacto(String name, String phone) {
        contact.put(name.toLowerCase(), phone);
        System.out.println("Contacto agregado: " + name + " - " + phone);
    }
    
    public void buscarContacto(String name) {
        String phone = contact.get(name.toLowerCase());
        
        if (phone != null) {
            System.out.println("Teléfono de " + name + ": " + phone);
        } else {
            System.out.println("Contacto no encontrado: " + name);
        }
    }
    
    public void mostrarTodosLosContactos() {
        System.out.println("\n--- Todos los contactos ---");
        if (contact.isEmpty()) {
            System.out.println("No hay contactos en la agenda.");
        } else {
            for (HashMap.Entry<String, String> entry : contact.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}