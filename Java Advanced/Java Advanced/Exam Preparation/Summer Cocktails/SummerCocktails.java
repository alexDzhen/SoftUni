import java.util.*;
import java.util.stream.Collectors;

public class SummerCocktails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> ingredients = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> freshnessLevel = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Map<String, Integer> cocktails = new TreeMap<>();
        while (!ingredients.isEmpty() && !freshnessLevel.isEmpty()) {
            int bucket = ingredients.get(0);
            if (bucket == 0) {
                ingredients.remove(0);
                continue;
            }
            int freshLevel = freshnessLevel.get(freshnessLevel.size() - 1);
            int totalFreshnessLevel = bucket * freshLevel;
            switch (totalFreshnessLevel) {
                case 150:
                    addCocktail(cocktails, "Mimosa");
                    removeParts(freshnessLevel, ingredients);
                    break;
                case 250:
                    addCocktail(cocktails, "Daiquiri");
                    removeParts(freshnessLevel, ingredients);
                    break;
                case 300:
                    addCocktail(cocktails, "Sunshine");
                    removeParts(freshnessLevel, ingredients);
                    break;
                case 400:
                    addCocktail(cocktails, "Mojito");
                    removeParts(freshnessLevel, ingredients);
                    break;
                default:
                    freshnessLevel.remove(freshnessLevel.size() - 1);
                    int ingredient = ingredients.remove(0);
                    ingredients.add(ingredient + 5);
                    break;
            }
        }
        if (cocktails.size() >= 4) {
            System.out.println("It's party time! The cocktails are ready!");
        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }
        if (!ingredients.isEmpty()) {
            int sum = ingredients.stream().mapToInt(Integer::valueOf).sum();
            System.out.println(String.format("Ingredients left: %d", sum));
            //int sum2 = 0;
            //for (Integer ingredient : ingredients) {
            //  sum2 += ingredient;
            //}
        }
        cocktails.forEach((k, v) -> System.out.println(String.format(" # %s --> %d", k, v)));
    }

    private static void removeParts(List<Integer> freshnessLevel, List<Integer> ingredients) {
        ingredients.remove(0);
        freshnessLevel.remove(freshnessLevel.size() - 1);
    }

    private static void addCocktail(Map<String, Integer> cocktails, String currentCocktail) {
        if (cocktails.containsKey(currentCocktail)) {
            int count = cocktails.get(currentCocktail);
            cocktails.put(currentCocktail, count);
        } else {
            cocktails.put(currentCocktail, 1);
        }
    }
}
