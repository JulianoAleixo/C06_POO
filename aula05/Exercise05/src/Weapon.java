public class Weapon {
    public String name;
    public int power;
    public int resistance;
    public String description;

    public void showInfo() {
        System.out.printf("Name: %s \nPower: %d \nResistance: %d \nDescription: %s\n",
                name, power, resistance, description);
    }
}
