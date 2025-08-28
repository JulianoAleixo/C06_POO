public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina();

        cantina.name = "Cantina do Inatel";
        cantina.snacks = new Snack[3];

        Snack snack1 = new Snack();
        Snack snack2 = new Snack();
        Snack snack3 = new Snack();

        snack1.name = "Coxinha";
        snack2.name = "Kibe";
        snack3.name = "Pizza";

        cantina.addSnack(snack1);
        cantina.addSnack(snack2);
        cantina.addSnack(snack3);

        cantina.showInfo();
    }
}