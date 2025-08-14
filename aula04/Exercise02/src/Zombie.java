public class Zombie {
    public double life;
    public String name;

    public void showLife() {
        System.out.printf("%s's life is %.2f\n", name, life);
    }

    public void transferLife(Zombie targetZombie, double quantity) {
        this.life -= quantity;
        targetZombie.life += quantity;
    }
}
