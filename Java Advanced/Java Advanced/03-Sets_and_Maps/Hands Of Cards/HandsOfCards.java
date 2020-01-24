import java.util.*;
import java.util.stream.Collectors;

public class HandsOfCards {
    public static Map<Character, Integer> powerTable = Map.of('J', 11, 'Q', 12, 'K', 13, 'A', 14, 'S', 4, 'H', 3, 'D', 2, 'C', 1);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Map<String, Set<String>> playersWithDecks = new LinkedHashMap<>();
        while (!"JOKER".equals(input = scanner.nextLine())) {
            String[] out = input.split(": ");
            String player = out[0];
            String[] cards = out[1].split(", ");
            Set<String> setCards = new HashSet<>(Arrays.stream(cards).collect(Collectors.toSet()));
            playersWithDecks.putIfAbsent(player, setCards);
            if (playersWithDecks.containsKey(player)) {
                Set<String> merg = new HashSet<>();
                merg.addAll(setCards);
                merg.addAll(playersWithDecks.get(player));
                playersWithDecks.put(player, merg);
            }

        }
        playersWithDecks.entrySet().stream()
                .forEach(entry -> System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue().stream().mapToInt(e -> calculateDeckPower(e)).sum())));
    }

    private static int calculateDeckPower(String card) {
        char first = card.charAt(0);
        int power = 0;
        if (Character.isDigit(first)) {
            power = first - '0';
            power = power == 1 ? 10 : power;
        } else {
            power = powerTable.get(first);
        }
        power *= powerTable.get(card.charAt(card.length() - 1));
        return power;
    }
}
