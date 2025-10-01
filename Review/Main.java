import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person Person1 = new Person("Tomas", 21);
        Person Person2 = new Person("Santiago", 33);
        Person Person3 = new Person("Luisa", 37);
        Person Person4 = new Person("HIllary", 18);
        Person Person5 = new Person("Raul", 22);
        Person Person6 = new Person("La Buty", 17);

        
        Person1.Display(args);
        Person2.Display(args);
        Person3.Display(args);
        Person4.Display(args);
        Person5.Display(args);
        Person6.Display(args);

        // ArrayList<Person> personList = new ArrayList<Person>();

        // personList.add(Person1);
        // personList.add(Person2);
        // personList.add(Person3);
        // personList.add(Person4);


        ArrayList<Animal> animals = new ArrayList<>();
        Cat Cat1 = new Cat();
        Cat Cat2 = new Cat();
        Cat Cat3 = new Cat();
        Dog Dog1 = new Dog();
        Dog Dog2 = new Dog();
        Dog Dog3 = new Dog();

        animals.add(Dog1);
        animals.add(Dog2);
        animals.add(Dog3);
        animals.add(Cat1);
        animals.add(Cat2);
        animals.add(Cat3);

        System.out.println(animals);

        // for (Animal animal : animals) {
        //     System.out.println(animal.makeSound());
        // }

        

    }
}
