import java.util.Random;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;

        int userNumber;
        do {
            System.out.println("Enter a random number between 1 and 10: ");
            userNumber = sc.nextInt();
        } while (userNumber != randomNumber);

        System.out.println("You found the random number!");

        sc.close();
    }
}
