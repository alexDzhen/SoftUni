import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split("\\s+");
        double sum = 0.;
        for (String input : inputs) {
            char first = input.charAt(0);
            char last = input.charAt(input.length() - 1);
            int positionAlphabetFirst = 0;
            int positionAlphabetLast = 0;
            StringBuilder numbers = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (Character.isDigit(input.charAt(i))) {
                    numbers.append(input.charAt(i));
                }
            }
            double digit = Double.parseDouble(numbers.toString());
            if (Character.isUpperCase(first)) {
                positionAlphabetFirst = first - 64;
                digit = digit / positionAlphabetFirst;
            } else if (Character.isLowerCase(first)) {
                positionAlphabetFirst = first - 96;
                digit = digit * positionAlphabetFirst;
            }
            if (Character.isUpperCase(last)) {
                positionAlphabetLast = last - 64;
                digit = digit - positionAlphabetLast;
            } else if (Character.isLowerCase(last)) {
                positionAlphabetLast = last - 96;
                digit = digit + positionAlphabetLast;
            }
            sum += digit;
        }
        System.out.printf("%.2f", sum);
    }
}
