public class Main {
    public static void main(String[] args) {
        Zombie z1 = new Zombie();
        Zombie z2 = new Zombie();

        z1.name = "Zombie 1";
        z1.life = 100;

        z2.name = "Zombie 2";
        z2.life = 100;

        z1.showLife();
        z2.showLife();

        System.out.print("\n");

        z1.transferLife(z2, 33.3);
        z1.showLife();
        z2.showLife();

        System.out.print("\n");

        z1 = z2;
        z1.transferLife(z2, 33.3);
        z1.showLife();
        z2.showLife();
    }
}