package Day1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Day1.models.Agenda;
import Day1.models.Animals;
import Day1.models.Cat;
import Day1.models.Dog;
import Day1.models.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person person1 = new Person("Yeferson", 24);
        Person person2 = new Person("Alejandro", 30);
        Person person3 = new Person("Maikol", 54);

        System.out.println("Soy " + person1.getName() + " y tengo " + person1.getAge());
        System.out.println("Soy " + person2.getName() + " y tengo " + person2.getAge());
        System.out.println("Soy " + person3.getName() + " y tengo " + person3.getAge() + "\n");

        List<Person> personList = new ArrayList<>();

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        for (Person person : personList) {
            if (person.getAge() >= 18) {
                System.out.println(person.getName() + " es mayor de edad." + "(" + person.getAge() + ")");
            }
        }

        System.out.println();
        Agenda myAgenda = new Agenda();

        myAgenda.agregarContacto("Yeferson", "3128812662");
        myAgenda.agregarContacto("Alejandro", "3135343212");
        myAgenda.agregarContacto("Fabio", "3145900342");
        System.out.println();
        myAgenda.buscarContacto("fabio");

        Dog myDog = new Dog();
        Cat myCat = new Cat();

        System.out.println();
        myDog.makeSound();
        myCat.makeSound();
        System.out.println();

        ArrayList<Animals> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        for (Animals animal : animals) {
            animal.makeSound();
        }

        HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();

        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("java");
        wordList.add("python");
        wordList.add("java");
        wordList.add("javascript");
        wordList.add("python");
        wordList.add("java");
        wordList.add("c++");
        wordList.add("javascript");
        wordList.add("python");
        wordList.add("java");

        for (String word : wordList) {
            if (wordCounter.containsKey(word)) {
                int currentCount = wordCounter.get(word);
                wordCounter.put(word, currentCount + 1);
            } else {
                wordCounter.put(word, 1);
            }

        }

        System.out.println();
        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " veces");
        }

        String[] words = {"Python", "Java", " JavaScript", "Python", "Java", " JavaScript"};
        for (String word : words) {
            wordList.add(word);
        }

    }
}
