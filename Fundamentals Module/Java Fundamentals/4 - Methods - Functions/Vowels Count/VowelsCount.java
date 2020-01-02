import java.util.Scanner;

public class VowelsCount {
    private static int getVowelsCount(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            switch (symbol) {
                case 'A':
                case 'E':
                case 'I':
                case 'U':
                case 'O':
                    count++;
                    break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        System.out.println(getVowelsCount(input));
    }
}
