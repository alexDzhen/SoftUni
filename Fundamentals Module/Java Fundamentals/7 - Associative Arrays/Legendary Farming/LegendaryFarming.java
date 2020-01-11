import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> specialItem = new TreeMap<>();
        Map<String, Integer> junkItems = new TreeMap<>();
        specialItem.put("shards", 0);
        specialItem.put("fragments", 0);
        specialItem.put("motes", 0);
        boolean isObtained = false;
        while (!isObtained) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            for (int i = 0; i < tokens.length; i += 2) {
                int quantity = Integer.parseInt(tokens[i]);
                String item = tokens[i + 1].toLowerCase();
                if (specialItem.containsKey(item)) {
                    int num = specialItem.get(item) + quantity;
                    specialItem.put(item, num);
                } else {
                    if (!junkItems.containsKey(item)) {
                        junkItems.put(item, quantity);
                    } else {
                        int secondNum = junkItems.get(item) + quantity;
                        junkItems.put(item, secondNum);
                    }
                }
                if (specialItem.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    int num = specialItem.get("shards") - 250;
                    specialItem.put("shards", num);
                    isObtained = true;
                    break;
                } else if (specialItem.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    int num = specialItem.get("fragments") - 250;
                    specialItem.put("fragments", num);
                    isObtained = true;
                    break;
                } else if (specialItem.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    int num = specialItem.get("motes") - 250;
                    specialItem.put("motes", num);
                    isObtained = true;
                    break;
                }
            }
        }
        specialItem.entrySet().stream().sorted((a, b) -> {
            if (b.getValue() - a.getValue() == 0) {
                return a.getKey().compareTo(b.getKey());
            } else {
                return b.getValue() - a.getValue();
            }
        }).forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkItems.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
