import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phonebook = new HashMap<>();
        String input;
        while (!"search".equals(input = scanner.nextLine())) {
            String[] split = input.split("-");
            String name = split[0];
            String number = split[1];
            phonebook.put(name, number);
        }
        while (!"stop".equals(input = scanner.nextLine())) {
            if (phonebook.containsKey(input)) {
                System.out.println(String.format("%s -> %s", input, phonebook.get(input)));
            } else {
                System.out.println(String.format("Contact %s does not exist.", input));
            }
        }
    }
}
