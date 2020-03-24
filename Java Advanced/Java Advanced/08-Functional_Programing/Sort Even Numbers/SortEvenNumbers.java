import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        List<Integer> input = readInput(new Scanner(System.in));
        Predicate<Integer> isEven = (Integer number) -> number % 2 == 0;

        String output = input.stream()
                .filter(isEven)
                .map(num -> num.toString())
                .collect(Collectors.joining(", "));
        String sortedOutpud = input.stream()
                .filter(isEven)
                .sorted()
                .map(number -> number.toString())
                .collect(Collectors.joining(", "));
        System.out.println(output);
        System.out.println(sortedOutpud);
    }

    private static List<Integer> readInput(Scanner scanner) {
        String line = scanner.nextLine();
        String[] split = line.split(", ");
        return Arrays.stream(split)
                .map(string -> Integer.valueOf(string))
                .collect(Collectors.toList());
    }
}

