import java.util.Scanner;

public class PasswordValidator {
    private static boolean checkIsBetween(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean checkIsContains(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            boolean isDigit = Character.isDigit(symbol);
            boolean isLetter = Character.isLetter(symbol);
            if (!isDigit && !isLetter) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfHaveTwoDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)) {
                count++;
            }
            if (count == 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (checkIfHaveTwoDigits(input) && checkIsBetween(input) && checkIsContains(input)) {
            System.out.println("Password is valid");
        }
        if (!checkIsBetween(input)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!checkIsContains(input)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!checkIfHaveTwoDigits(input)) {
            System.out.println("Password must have at least 2 digits");
        }
    }
}
