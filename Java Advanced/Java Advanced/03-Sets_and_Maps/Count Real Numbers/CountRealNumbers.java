import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double, Integer> map = new LinkedHashMap<>();
        while (scanner.hasNextDouble()) {
            double dbl = scanner.nextDouble();
            if (map.containsKey(dbl)) {
                int previousValue = map.get(dbl);
                map.put(dbl, previousValue + 1);
            } else {
                map.put(dbl, 1);
            }
        }
        for (Map.Entry<Double, Integer> element : map.entrySet()) {
            System.out.println(String.format("%.1f -> %d", element.getKey(), element.getValue()));
        }
    }
}
