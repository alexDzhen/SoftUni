import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> emails = new HashMap<>();
        String input;
        while (!"stop".equals(input = scanner.nextLine())) {
            String email = scanner.nextLine();
            if (email.contains("com")) {
                continue;
            } else if (email.contains("us")) {
                continue;
            } else if (email.contains("uk")) {
                continue;
            } else {
                emails.put(input, email);
            }
        }
        for (Map.Entry<String, String> entry : emails.entrySet()) {
            System.out.println(String.format("%s -> %s", entry.getKey(), entry.getValue()));
        }
    }
}
