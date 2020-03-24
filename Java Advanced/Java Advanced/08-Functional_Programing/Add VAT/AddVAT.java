import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) {
        List<String> input = readInput(new Scanner(System.in));
        UnaryOperator<Double> addVat = (dbl) -> dbl * 1.20;
        Function<Double, String> toStringRounded = (dbl) -> String.format("%.2f", dbl);
        System.out.println("Prices with VAT:");
        input.stream()
                .map(str -> Double.parseDouble(str))
                .map(addVat)
                .map(toStringRounded)
                .forEach((str) -> System.out.println(str));
    }

    private static List<String> readInput(Scanner scanner) {
        String line = scanner.nextLine();
        String[] split = line.split(", ");
        return Arrays.stream(split)
                .collect(Collectors.toList());
    }
}
