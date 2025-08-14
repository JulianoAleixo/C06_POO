public class Main {
    public static void main(String[] args) {
        Person chris = new Person();

        chris.name = "Christopher";
        chris.age = 33;
        chris.favoriteFood = "Java";

        chris.speech();

        Zombie zombie = new Zombie();
        zombie.name = "Chris";
        zombie.age = 33;
        zombie.favoriteFood = "Brain";

        zombie.speech();
        zombie.groan();
    }
}