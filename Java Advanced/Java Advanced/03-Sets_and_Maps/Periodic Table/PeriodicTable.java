import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Set<String> compounds = new TreeSet<>();
        while (n-- > 0) {
            compounds.addAll(Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toSet()));
        }
        compounds.forEach(e -> System.out.print(e + " "));
    }
}
