import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> lettersMap = new LinkedHashMap<>();
        char[] letter = input.toCharArray();
        for (char c : letter) {
            if (c != ' ') {
                lettersMap.putIfAbsent(c, 0);
                lettersMap.put(c, lettersMap.get(c) + 1);
            }
        }
//        for (Map.Entry<Character, Integer> characterIntegerEntry : lettersMap.entrySet()) {
//            System.out.println(characterIntegerEntry.getKey()+" -> "+ characterIntegerEntry.getValue());
//        }
        lettersMap.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
