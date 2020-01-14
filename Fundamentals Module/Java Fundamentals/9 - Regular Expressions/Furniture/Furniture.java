import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        List<String> furnitureCollection = new ArrayList<>();
        double totalPrice = 0;
        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>\\d+\\.?\\d+)!(?<count>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        while (!"Purchase".equals(input = scanner.nextLine())) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furniture = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("count"));
                furnitureCollection.add(furniture);
                double furniturePrice = price * quantity;
                totalPrice += furniturePrice;
            }
        }
        System.out.println("Bought furniture:");
        for (String s : furnitureCollection) {
            System.out.println(s);
        }
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
