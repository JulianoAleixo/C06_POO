public class Main {
    public static void main(String[] args) {
        Pilot p1 = new Pilot();
        Pilot p2 = new Pilot();

        p1.name = "Mario";
        p1.isVillain = false;

        p2.name = "Bowser";
        p2.isVillain = true;

        Engine e1 = new Engine();
        Engine e2 = new Engine();

        e1.cylinderCapacity = "100";
        e1.maxVelocity = 200;

        e2.cylinderCapacity = "150";
        e2.maxVelocity = 100;

        Kart k1 = new Kart();
        Kart k2 = new Kart();

        k1.name = "Mario's kart";
        k1.pilot = p1;
        k1.engine = e1;

        k2.name = "Bowser's kart";
        k2.pilot = p2;
        k2.engine = e2;

        p1.useSuperPower();
        p2.useSuperPower();

        System.out.println();

        e1.showInfo();
        e2.showInfo();

        System.out.println();

        k1.jump();
        k1.useTurbo();
        k1.makeDrift();
        k2.jump();
        k2.useTurbo();
        k2.makeDrift();
    }
}