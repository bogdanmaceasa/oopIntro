import pets.Animal;
import pets.Cat;

import java.time.LocalDate;

public class OopIntroMain {
    public static void main(String[] args) {

        // working with constructors /getters /setters
//        System.out.println("Starting the investigation...");
//
//        Person p1 = new Person(30,"Bogdan");
//        p1.getAge();
//
//        System.out.println("Investigation is still running");
//
//        Person p2 = new Person();
        //not ok because we must follow encapsulation rules
//        p2.age = 6;
//        p2.nume = "bogdan";

//        p2.getAge();
//        p1.equals(p2);
//
//        System.out.println("Investigation is done!");

        // getters / setters / inheritance
//        Animal myPet = new Cat();
//        myPet.setHungry(true);
//        myPet.feed();
//        Animal sistersPet = new Dog();
//        sistersPet.setHungry(true);
//        sistersPet.feed();
//        Animal dadsPet = new Rabbit();
//        dadsPet.setHungry(true);
//        dadsPet.feed();


        //composition
        Animal cat = new Cat("Garfield");
//        Person p = new Person(cat);
        Person p = new Person();

        // petty the pet has his own instance
        p.getPet().getName();
        System.out.println(p);

        // petty the pet is lost for ever
        p.setPet(cat);

        p.setName("Dan");
        p.setDateOfBirth(LocalDate.of(1990, 04, 21));
        System.out.println(p);

        p = new Person();
        System.out.println(p + " and a ownerless cat: " + cat);

        Person p4 = new Person();
        p4.setName("Adrian");
        p4.setDateOfBirth(LocalDate.of(1990, 04, 21));
        System.out.println(p4);

        p4 = new Person();
        // access to previous instance is lost for ever.
        System.out.println(p4);


        Person student1 = new Student();
        System.out.println(student1);
        student1.setName("Florin");
        student1.getJobStatus();
        System.out.println(student1);

        Student student2 = new Student("BV128738q23z1iaw8123");
        student2.setName("Mihai");
        student2.getPet().setName("Rex");

        System.out.println(student2);

//        null != new Student();
//        Person student3= null;
//        student3.setName("x");

        Person student4 = new Student("BV128738q23z1iaw8123");
        Student student5 = new Student("BV128738q23z1iaw8123");

        // Student reference will look at the instance from
        // a Student point of view
        student5.getStudentID();

        // Person reference will look at the instance from
        // a Person point of view
        student4.getName();
    }
}
