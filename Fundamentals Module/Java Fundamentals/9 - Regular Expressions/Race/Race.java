import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] participants = scanner.nextLine().split(", ");
        Map<String, Integer> racers = new LinkedHashMap<>();
        for (int i = 0; i < participants.length; i++) {
            racers.put(participants[i], 0);
        }
        String input;
        String nameRegex = "[A-Za-z]";
        String digitRegex = "\\d";
        Pattern namePattern = Pattern.compile(nameRegex);
        Pattern digitPattern = Pattern.compile(digitRegex);
        while (!"end of race".equals(input = scanner.nextLine())) {
            Matcher nameMatcher = namePattern.matcher(input);
            StringBuilder name = new StringBuilder();
            while (nameMatcher.find()) {
                name.append(nameMatcher.group());
            }
            int distance = 0;
            if (racers.containsKey(name.toString())) {
                Matcher digitMatcher = digitPattern.matcher(input);
                while (digitMatcher.find()) {
                    distance += Integer.parseInt(digitMatcher.group());
                }
                racers.put(name.toString(), racers.get(name.toString()) + distance);
            }
        }
        int[] count = {1};
        racers.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue()).limit(3).forEach(e -> {
            switch (count[0]) {
                case 1:
                    System.out.println("1st place: " + e.getKey());
                    break;
                case 2:
                    System.out.println("2nd place: " + e.getKey());
                    break;
                case 3:
                    System.out.println("3rd place: " + e.getKey());
                    break;
            }
            count[0]++;
        });
    }
}
