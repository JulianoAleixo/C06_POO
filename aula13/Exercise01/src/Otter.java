public class Otter extends Mammal {
    public Otter(String name, double life) {
        super(name, life);
    }

    @Override
    public void makeSound() {
        System.out.println("rrrrrr");
    }
}
