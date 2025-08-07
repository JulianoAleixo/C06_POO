import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NPA;
        do {
            System.out.println("Enter with the 'NPA' value.");
            NPA =  sc.nextInt();
            if (NPA < 0 || NPA > 100) {
                System.out.println("[Error] Invalid value. Enter a number between 0 and 100.");
            }
        } while (NPA < 0 || NPA > 100);

        if (NPA < 60) {
            int NP3;
            System.out.println("Enter with the 'NP3' value.");
            do {
                NP3 = sc.nextInt();
                if (NP3 < 0 || NP3 > 100) {
                    System.out.println("[Error] Invalid value. Enter a number between 0 and 100.");
                }
            } while (NP3 < 0 || NP3 > 100);

            if ((NPA + NP3) / 2 > 50) {
                System.out.println("Passed");
            } else {
                System.out.println("Dont passed");
            }
        } else {
            System.out.println("Passed");
        }

        sc.close();
    }
}
