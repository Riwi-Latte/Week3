import java.util.ArrayList;

public class review {
    public static void main(String[] args) {

        Person camilo = new Person("Camilo", 27);
        Person laura = new Person("Laura", 25);
        Person sofia = new Person("Sofia", 27);

        ArrayList<Person> persons = new ArrayList<>();

        System.out.println("Se agregaron 3 personas al sistema:\n\n" + "1. - " + camilo.getName()
                + " con una edad de: " + camilo.getAge() + " años\n" + "2. - " + laura.getName()
                + " con una edad de: " + laura.getAge() + " años\n" + "1. - " + sofia.getName()
                + " con una edad de: " + sofia.getAge() + " años\n");

        persons.add(camilo);
        persons.add(laura);
        persons.add(sofia);

        System.out.println("Las personas mayores a 18 años son:  \n");
        for (Person p : persons) {
            if (p.getAge() >= 18) {
                System.out.println(" -- " + p.getName());
            }
        }

        Agenda agenda = new Agenda();

        agenda.addAgenda("Pedrito", "3214321245");
        agenda.addAgenda("Karen", "1234122123");
        agenda.addAgenda("Alexandra", "5434223");

        System.out.println("Pedrito");
        System.out.println(agenda.get("Pedrito"));


    }
}
