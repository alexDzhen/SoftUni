import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> drinksPrice = new LinkedHashMap<>();
        Map<String, Integer> drinksQuantity = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!"buy".equals(input)) {
            String[] tokens = input.split(" ");
            String drink = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);
            if (!drinksPrice.containsKey(drink)) {
                drinksPrice.put(drink, price);
                drinksQuantity.put(drink, quantity);
            } else {
                if (drinksPrice.values().equals(price)) {
                    drinksQuantity.put(drink, drinksQuantity.get(drink) + quantity);
                } else {
                    drinksPrice.put(drink, price);
                    drinksQuantity.put(drink, drinksQuantity.get(drink) + quantity);
                }
            }
            input = scanner.nextLine();
        }
        drinksPrice.forEach((key, value) -> {
            System.out.print(key + " -> ");
            drinksQuantity.forEach((k, v) -> {
                if (k.equals(key)) {
                    System.out.println(String.format("%.2f", value * v));
                }
            });
        });
    }
}
