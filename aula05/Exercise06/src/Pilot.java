public class Pilot {
    public String name;
    public boolean isVillain;

    public void useSuperPower() {
        if (this.isVillain) {
            System.out.printf("%s uses evil super power! \n", name);
        } else {
            System.out.printf("%s uses super power! \n", name);
        }
    }
}
