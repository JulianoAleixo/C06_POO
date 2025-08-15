public class Main {
    public static void main(String[] args) {
        Character character1 = new Character();
        Character character2 = new Character();
        Weapon weapon1 = new Weapon();

        character1.name = "Veigar";
        character1.points = 10;

        character2.name = "Mordekaiser";
        character2.points = 20;

        weapon1.name = "Rabadon's Deathcap";
        weapon1.power = 8;
        weapon1.resistance = 6;
        weapon1.description = "Rabadon's Deathcap is a powerful offensive item in League of Legends that greatly " +
                "increases a champion's ability power, making it a popular choice for mages and other ability " +
                "power-scaling champions. It grants a significant amount of ability power and also amplifies the " +
                "total ability power the champion possesses. ";

        character1.weapon = weapon1;

        weapon1.showInfo();

        character1.useGun(character2);
        System.out.printf("Name: %s \nPoints: %d \n", character1.name, character1.points);
        System.out.printf("Name: %s \nPoints: %d \n", character2.name, character2.points);

        weapon1.showInfo();
    }
}