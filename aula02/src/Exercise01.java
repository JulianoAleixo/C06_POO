public class Exercise01 {
    public static void main(String[] args) {
        int quantity1 = 10,  quantity2 = 4, quantity3 = 2;

        int total = quantity1 + quantity2 + quantity3;
        float average = (float) total / 3;

        System.out.printf("Total of hamburgers: %d\n", total);
        System.out.printf("Average number of hamburgers consumed: %.2f\n", average);
    }
}
