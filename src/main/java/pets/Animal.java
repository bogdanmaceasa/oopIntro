package pets;

public class Animal {

    private boolean isHungry;
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void feed(){
        if(isHungry) {
            System.out.println("Animal is hungry...Feeding time!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    @Override public String toString() {
        return name + '\'';
    }
}
