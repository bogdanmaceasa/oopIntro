package pets;

public class Rabbit extends Animal {

    public Rabbit(String name) {
        super(name);
    }

    @Override public void feed() {
        System.out.println("Rabbit is nom-noming his grass...\n");
    }
}
