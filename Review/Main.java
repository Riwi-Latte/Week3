package Review;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args){

        //ArrayList

        ArrayList<Person> People = new ArrayList<>();

        Person person1 = new Person("Isabella", 18);
        Person person2 = new Person("Adrian",26);
        Person person3 = new Person();

        System.out.println("Persona 3 vacio: "+ "Nombre: "+person3.getName()+ ", Edad: "+person3.getAge());

        person3.setName("Laura");
        person3.setAge(17);


        System.out.println("Persona 1:\n"+ "Nombre: "+ person1.getName()+"\nEdad: "+ person1.getAge());
        System.out.println("Persona 2:\n"+ "Nombre: "+ person2.getName()+"\nEdad: "+ person2.getAge());
        System.out.println("Persona 3:\n"+ "Nombre: "+ person3.getName()+"\nEdad: "+ person3.getAge());

        //Activity 2

        People.add(person1);
        People.add(person2);
        People.add(person3);

        for(Person person : People){

            if(person.getAge()>=18){
                System.out.println(person.getName()+ " es mayor de edad");
            }
            
        }
    }
}
