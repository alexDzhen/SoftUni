import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int bestNumber = numbers[0];
        int bestCounter = 1;
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            int currentCount = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                int number = numbers[j];
                if (currentNumber == number) {
                    currentCount++;
                    if (currentCount > bestCounter) {
                        bestCounter = currentCount;
                        bestNumber = currentNumber;
                    }
                } else {
                    break;
                }
            }
        }
        for (int j = 0; j < bestCounter; j++) {
            System.out.print(bestNumber + " ");
        }
    }
}
