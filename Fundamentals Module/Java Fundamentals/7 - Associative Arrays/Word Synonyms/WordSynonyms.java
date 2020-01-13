import java.util.*;
import java.util.stream.Collectors;

public class WordSynonyms {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> words = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            words.putIfAbsent(word,new ArrayList<>());
            words.get(word).add(synonym);
        }
        for (Map.Entry<String, ArrayList<String>>entry:words.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),entry.getValue().stream().collect(Collectors.joining(", ")));
        }
    }
}
