import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> materials = new HashMap<>();
        String sIn;
        while (!"stop".equals(sIn = scanner.nextLine())) {
            int iIn = Integer.parseInt(scanner.nextLine());
            if (materials.containsKey(sIn)) {
                int sum = iIn + materials.get(sIn);
                materials.put(sIn, sum);
            } else {
                materials.putIfAbsent(sIn, iIn);
            }
        }
        for (Map.Entry<String, Integer> entry : materials.entrySet()) {
            System.out.println(String.format("%s -> %d", entry.getKey(), entry.getValue()));
        }
    }
}
