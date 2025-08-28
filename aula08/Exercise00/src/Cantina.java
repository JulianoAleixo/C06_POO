public class Cantina {
    public String name;
    public Snack[] snacks;

    public void addSnack(Snack newSnack) {
        for  (int i = 0; i < snacks.length; i++) {
            if (snacks[i] == null) {
                snacks[i] = newSnack;
                break;
            }
        }
    }

    public void showInfo() {
        System.out.printf("Bem vindos à %s\n", this.name);

        for (int i = 0; i < snacks.length; i++) {
            if (snacks[i] != null) {
                System.out.printf("%d. %s\n", i, snacks[i].name);
            }
        }
    }
}
