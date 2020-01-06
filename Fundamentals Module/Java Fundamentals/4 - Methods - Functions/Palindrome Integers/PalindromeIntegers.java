import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!"END".equals(input)) {
            System.out.println(isTrue(input));
            input = scanner.nextLine();
        }
    }

    private static boolean isTrue(String input) {
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        boolean isTrue = false;
        if (reverse.equals(input)) {
            isTrue = true;
        }
        return isTrue;
    }
}
