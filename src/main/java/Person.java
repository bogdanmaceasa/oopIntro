import pets.Animal;

import java.time.LocalDate;
import java.util.Objects;

public class Person{

    private int age;
    private LocalDate dateOfBirth;
    private String name;
    // example of composition
//    private Animal pet;

    // inline instance of pet
    // example of containment = the instance is destroyed
    // then the person instance is destroyed
    private Animal pet = new Animal("petty");

    // If no constructor is defined by us,
    // default constructor is added by Java,
    // through inheritance from Object.class

    // If we define a constructor, the default
    // will no longer be inserted by Java
    public Person(){
        // The first position in any constructor
        // is a call to the super-class constructor

        // the default super-class for all java classes
        // is Object.class
        super();
        pet = new Animal("Default name");
    }
    //    }

    public Person(int age, String name){
//        super();
//        this();
        this.age=age;
        this.name=name;
//        this.pet = new Animal("Default name");
    }

    // example of aggregation in controller
    public Person(Animal animal){
        this.pet = animal;
    }

    public int getAge(){
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
        return age;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public void getJobStatus(){
        if(age < 21){
            System.out.println("not old enough for a full time job...");
        } else {
            System.out.println(name + " is working.");
        }
    }

    public void isEligibleForDriversLicense(){
        if(age >= 18){
            System.out.println(name + " is eligible for his/her full drivers license ");
        } else if (age >= 16) {
            System.out.println(name + " is eligible for his/her drivers license ");
        } else {
            System.out.println(name + " will ride his/her bike until 16. ");
        }
    }

    public void ticketPricing(){
        if(age <= 7 ){
            System.out.println( name + " has free tickets.");
        } else if(age < 18 ){
            System.out.println( name + " has 50% off tickets.");
        } else {
            System.out.println( name + " needs to pay full price.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return dateOfBirth.equals(person.dateOfBirth) && name.equals(person.name);
    }

    @Override public int hashCode() {
        return Objects.hash(dateOfBirth, name);
    }

    @Override public String toString() {
        return "Person{" + "age=" + age + ", dateOfBirth=" + dateOfBirth + ", name='" + name + '\'' +
            ( pet != null ? ", has a pet called " + pet + '}' : '}' );
        // if (pet != null)
//           System.out.println(", has a pet called " + pet + '}')
//            else         System.out.println('}')
    }
}
