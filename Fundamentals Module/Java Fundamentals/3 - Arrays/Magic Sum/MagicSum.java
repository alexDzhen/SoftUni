import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numbers.length - 1; i++) {
            int number = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int number1 = numbers[j];
                if (number + number1 == target) {
                    System.out.printf("%d %d%n", number, number1);
                }
            }
        }
    }
}
