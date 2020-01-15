import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String digits = "";
        String letters = "";
        String symbols = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                digits += ch;
            } else if (Character.isLetter(ch)) {
                letters += ch;
            } else {
                symbols += ch;
            }
        }
        System.out.printf("%s%n%s%n%s%n", digits, letters, symbols);
    }
}
