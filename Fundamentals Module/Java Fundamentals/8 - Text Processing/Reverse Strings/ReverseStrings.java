import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        while (!"end".equals(line = scanner.nextLine())) {
            String reversed = "";
            for (int i = line.length() - 1; i >= 0; i--) {
                reversed += line.charAt(i);
            }
            System.out.printf("%s = %s%n", line, reversed);
        }
    }
}
