import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        List<Integer> input = readInput(new Scanner(System.in));
        int sum = input.stream().mapToInt(number -> number).sum();
        System.out.println("Count = " + input.size());
        System.out.println("Sum = " + sum);

    }

    private static List<Integer> readInput(Scanner scanner) {
        String line = scanner.nextLine();
        String[] split = line.split(", ");
        Function<String, Integer> stringIntegerFunction = string -> Integer.valueOf(string);
        return Arrays.stream(split)
                .map(stringIntegerFunction)
                .collect(Collectors.toList());
    }
}
