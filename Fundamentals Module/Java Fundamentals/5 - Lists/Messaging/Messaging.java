import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String message = scanner.nextLine();

        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            int index = calculateIndex(currentNumber);
            char currentChar = getCharFromMessage(index, message);
            System.out.print(currentChar);
            int realIndex = calculateRealIndex(index, message);
            StringBuilder newMessage = new StringBuilder(message);
            message = newMessage.deleteCharAt(realIndex).toString();
        }

    }

    private static int calculateRealIndex(int index, String message) {
        int countIndex = 0;
        for (int i = 0; i < index; i++) {
            countIndex++;
            if (countIndex == message.length()) {
                countIndex = 0;
            }
        }
        return countIndex;
    }

    private static char getCharFromMessage(int index, String message) {
        int countIndex = 0;
        for (int i = 0; i < index; i++) {
            countIndex++;
            if (countIndex == message.length()) {
                countIndex = 0;
            }
        }
        char currentChar = message.charAt(countIndex);
        return currentChar;
    }

    private static int calculateIndex(int number) {
        int index = 0;
        while (number > 0) {
            int currentNumber = number % 10;
            index += currentNumber;
            number /= 10;
        }
        return index;
    }
}
