public class Character {
    public String name;
    public int points;
    public Weapon weapon;

    public void useGun(Character targetCharacter) {
        targetCharacter.takeDamage();
        this.weapon.resistance -= 2;
    }

    public void takeDamage() {
        this.points -= 5;
    }
}
