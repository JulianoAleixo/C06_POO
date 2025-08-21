public class Main {
    public static void main(String[] args) {
        Pilot p1 = new Pilot();
        Pilot p2 = new Pilot();

        p1.name = "Mario";
        p1.isVillain = false;

        p2.name = "Bowser";
        p2.isVillain = true;
        
        Kart k1 = new Kart();
        Kart k2 = new Kart();

        k1.name = "Mario's kart";
        k1.pilot = p1;

        k1.engine.cylinderCapacity = "100";
        k1.engine.maxVelocity = 200;

        k2.name = "Bowser's kart";
        k2.pilot = p2;

        k2.engine.cylinderCapacity = "150";
        k2.engine.maxVelocity = 100;

        p1.useSuperPower();
        p2.useSuperPower();

        System.out.println();

        k1.engine.showInfo();
        k2.engine.showInfo();

        System.out.println();

        k1.jump();
        k1.useTurbo();
        k1.makeDrift();
        k2.jump();
        k2.useTurbo();
        k2.makeDrift();
    }
}