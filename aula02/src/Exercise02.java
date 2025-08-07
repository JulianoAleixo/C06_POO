import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantity1, quantity2, quantity3;

        do {
            System.out.println("Enter with the first quantity of hamburgers: ");
            quantity1 = sc.nextInt();
            if (quantity1 <= 0 || quantity1 > 100) {
                System.out.println("[Error] Quantity must be between 1 and 100.");
            }
        } while (quantity1 <= 0 || quantity1 > 100);

        do {
            System.out.println("Enter with the second quantity of hamburgers: ");
            quantity2 = sc.nextInt();
            if (quantity2 <= 0 || quantity2 > 100) {
                System.out.println("[Error] Quantity must be between 1 and 100.");
            }
        } while (quantity2 <= 0 || quantity2 > 100);

        do {
            System.out.println("Enter with the third quantity of hamburgers: ");
            quantity3 = sc.nextInt();
            if (quantity3 <= 0 || quantity3 > 100) {
                System.out.println("[Error] Quantity must be between 1 and 100.");
            }
        } while (quantity3 <= 0 || quantity3 > 100);

        int total = quantity1 + quantity2 + quantity3;
        float average = (float) total / 3;

        System.out.printf("Total of hamburgers: %d\n", total);
        System.out.printf("Average number of hamburgers consumed: %.2f\n", average);

        sc.close();
    }
}
