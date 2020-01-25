import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class СръбскоUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^(?<singer>[A-Za-z ]+){1,3} @(?<venue>[A-Za-z ]+){1,3} (?<price>\\d+) (?<tickets>\\d+)$";
        Pattern pattern = Pattern.compile(regex);
        Map<String, Map<String, Integer>> performances = new LinkedHashMap<>();
        String input;
        while (!"End".equals(input = scanner.nextLine())) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String singer = matcher.group("singer");
                String venue = matcher.group("venue");
                int price = Integer.parseInt(matcher.group("price"));
                int tickets = Integer.parseInt(matcher.group("tickets"));
                if (!performances.containsKey(venue)) {
                    performances.put(venue, new LinkedHashMap<>());
                }
                if (!performances.get(venue).containsKey(singer)) {
                    performances.get(venue).put(singer, 0);
                }

                int profit = performances.get(venue).get(singer) + price * tickets;
                performances.get(venue).put(singer, profit);
            }
        }
        performances.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().entrySet().stream()
                    .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                    .forEach(innerEntry ->
                            System.out.println(String.format("#  %s -> %d", innerEntry.getKey(), innerEntry.getValue())));
        });
    }
}
