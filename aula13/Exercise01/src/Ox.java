public class Ox extends Mammal {
    public Ox(String name, double life) {
        super(name, life);
    }

    @Override
    public void makeSound() {
        System.out.println("Muuu");
    }
}
