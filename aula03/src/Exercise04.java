import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantity;
        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("Enter with the students quantity: ");
            quantity = sc.nextInt();

            switch (quantity) {
                case 10:
                case 20:
                    System.out.println("The class will be on room I-16");
                    shouldContinue = false;
                    break;
                case 30:
                    System.out.println("The class will be on room I-22");
                    shouldContinue = false;
                    break;
                default:
                    System.out.println("[Error] Quantity must be 10 or 20 or 30.");
            }
        }

        sc.close();
    }
}
