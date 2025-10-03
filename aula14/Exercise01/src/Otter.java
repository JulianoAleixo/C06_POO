public class Otter extends Mammal implements Aquatic {
    public Otter(String name, double life) {
        super(name, life);
    }

    @Override
    public void makeSound() {
        System.out.println("rrrrrr");
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }
}
