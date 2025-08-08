import java.util.Random;
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(10) + 1;
        int userNumber;

        do {
            System.out.println("Enter a number between 1 and 10: ");
            userNumber = sc.nextInt();

            if (randomNumber > userNumber) {
                System.out.printf("The random number is greater then %d.\n", userNumber);
            } else if (randomNumber < userNumber) {
                System.out.printf("The random number is less then %d.\n", userNumber);
            }

        } while (userNumber != randomNumber);

        System.out.println("You found the random number!");

        sc.close();
    }
}
