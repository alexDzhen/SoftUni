import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    private static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(c + "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfStrings = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[numOfStrings];
        for (int i = 0; i < numOfStrings; i++) {
            String sequence = scanner.nextLine();
            int len = sequence.length();
            int sum = 0;
            for (int j = 0; j < sequence.length(); j++) {
                char current = sequence.charAt(j);
                if (isVowel(current)) {
                    sum += current * len;
                } else {
                    sum += current / len;
                }
            }
            numbers[i] = sum;
        }
        Arrays.sort(numbers);
        for (int element : numbers) {
            System.out.println(element);
        }
    }
}
