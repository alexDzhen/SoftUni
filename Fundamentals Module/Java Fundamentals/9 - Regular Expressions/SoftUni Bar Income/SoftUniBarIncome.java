import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        double totalIncome = 0;
        String regex = "%(?<customer>[A-Z][a-z]+)%[^\\d|$%.]*<(?<product>\\w+)>[^\\d|$%.]*\\|(?<count>\\d+)\\|[^\\d|$%.]*(?<price>\\d+\\.?\\d*)\\$";
        Pattern pattern = Pattern.compile(regex);
        while (!"end of shift".equals(input = scanner.nextLine())) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double totalPerson = count * price;
                totalIncome += totalPerson;
                System.out.printf("%s: %s - %.2f%n",customer, product, totalPerson);
            }
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
