import java.util.Scanner;

public class CharactersInRange {
    private static void printCharsBetween(char first, char second) {
        String output = "";
        if (second < first) {
            char firstOldValue = first;
            first = second;
            second = firstOldValue;
        }
        for (char i = (char) (first + 1); i < second; i++) {
            output += i + " ";
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        printCharsBetween(first, second);
    }
}