public class Dog extends Mammal {
    public Dog(String name, double life) {
        super(name, life);
    }

    @Override
    public void makeSound() {
        System.out.println("Auau");
    }
}
