import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String message = "";
        for (int i = 0; i < n; i++) {
            char ch = scanner.nextLine().charAt(0);
            int newCh = ch + key;
            message = message + (char) newCh;
        }
        System.out.println(message);
    }
}
