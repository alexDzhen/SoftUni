import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        String input;
        for (int i = 0; i < lines; i++) {
            input = scanner.nextLine();
            if ("0".equals(input)) {
                System.out.print(" ");
            } else {
                int lenght = input.length();
                int digit = Integer.parseInt(input) % 10;
                int offset;
                if (digit == 8 || digit == 9) {
                    offset = ((digit - 2) * 3) + 1;
                } else {
                    offset = (digit - 2) * 3;
                }
                int index = (offset + lenght - 1) + 97;
                System.out.print(Character.toChars(index));
            }
        }
    }
}