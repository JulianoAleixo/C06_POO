public class Zombie {
    public double life;
    public String name;

    public void showLife() {
        System.out.printf("%s's life is %.2f\n", name, life);
    }

    public boolean transferLife(Zombie targetZombie, double quantity) {
        if (this.life <= quantity) {
            return false;
        }
        this.life -= quantity;
        targetZombie.life += quantity;
        return true;
    }
}
