import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder out = new StringBuilder();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            out.append(input.charAt(i));
            while (i < length - 1 && input.charAt(i) == input.charAt(i+1)) {
                i++;
            }
        }
        System.out.println(out);
    }
}
