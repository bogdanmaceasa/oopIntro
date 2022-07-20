package pets;

public class Cat extends Animal {

    private int weight;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Cat is eating her cat food....meow!\n");
    }

    @Override public String toString() {
        return super.toString();
    }
}
