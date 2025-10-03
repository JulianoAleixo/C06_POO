public abstract class Mammal {
    protected String name;
    protected double life;

    public Mammal(String name, double life) {
        this.name = name;
        this.life = life;
    }

    public abstract void makeSound();

    public void showInfo() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Life: %.2f\n", life);
    }
}
