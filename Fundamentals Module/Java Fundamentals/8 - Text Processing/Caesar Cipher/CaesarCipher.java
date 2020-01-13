import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        int key = 3;
        String cypherText = encrypt(message, key);
        System.out.println(cypherText);
    }

    private static String encrypt(String message, int key) {
        char[] messageChars = message.toCharArray();
        for (int i = 0; i < messageChars.length; i++) {
            messageChars[i] += key;
        }
        return new String(messageChars);
    }
}
