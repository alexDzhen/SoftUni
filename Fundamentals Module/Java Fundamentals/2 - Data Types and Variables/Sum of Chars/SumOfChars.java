import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;
        for (int i = 0; i < numLines; i++) {
            totalSum += scanner.nextLine().charAt(0);
        }
        System.out.printf("The sum equals: %d",totalSum);
    }
}
