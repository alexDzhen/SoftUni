import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userNames = scanner.nextLine().split(", ");
        for (String user : userNames) {
            if (validation(user)) {
                System.out.println(user);
            }
        }
    }

    static boolean validation(String s) {
        boolean hasValidLength = checkLength(s);
        boolean isAllowedChar = true;
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                isAllowedChar = false;
            }
        }
        return hasValidLength && isAllowedChar;
    }

    static boolean checkLength(String s) {
        return (3 <= s.length() && s.length() <= 16) ? true : false;

    }
}
