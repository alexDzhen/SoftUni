import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        List<String> input = readInput(new Scanner(System.in));
        Predicate<String> startsWithCapitalLetter = (word) -> Character.isUpperCase(word.charAt(0));
        List<String> upperCaseWord = input.stream()
                .filter(startsWithCapitalLetter)
                .collect(Collectors.toList());
        System.out.println(upperCaseWord.size());
        upperCaseWord.forEach(word -> System.out.println(word));
    }

    private static List<String> readInput(Scanner scanner) {
        String line = scanner.nextLine();
        String[] split = line.split("\\s+");
        return Arrays.stream(split).collect(Collectors.toList());
    }
}
