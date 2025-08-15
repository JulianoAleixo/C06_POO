public class Kart {
    public String name;
    public Pilot pilot;
    public Engine engine;

    public void jump() {
        System.out.println("Jump");
    }

    public void useTurbo() {
        System.out.println("Use turbo");
    }

    public void makeDrift() {
        System.out.println("Make drift");
    }

    public Kart() {
        engine = new Engine();
    }
}
