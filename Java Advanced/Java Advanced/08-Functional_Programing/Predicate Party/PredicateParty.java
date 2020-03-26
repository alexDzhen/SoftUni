import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String input;
        while (!"Party!".equals(input = scanner.nextLine())) {
            String[] tokens = input.split("\\s+");
            Predicate<String> predicate = producePredicates(tokens[1], tokens[2]);
            List<String> temp = new ArrayList<>();
            names.forEach(n -> {
                if (predicate.test(n)) {
                    temp.add(n);
                }
            });
            if (tokens[0].equals("Remove")) {
                names.removeAll(temp);
            } else {
                names.addAll(temp);
            }
        }
        if (names.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println((names.stream()
                    .sorted(Comparator.naturalOrder())
                    .collect(Collectors.joining(", ")) + " are going to the party!"));
        }
    }

    private static Predicate<String> producePredicates(String command, String param) {
        Predicate<String> check;
        if (command.equals("StartsWith")) {
            check = str -> str.startsWith(param);
        } else if (command.equals("EndsWith")) {
            check = str -> str.endsWith(param);
        } else {
            check = str -> str.length() == Integer.parseInt(param);
        }
        return check;
    }
}
