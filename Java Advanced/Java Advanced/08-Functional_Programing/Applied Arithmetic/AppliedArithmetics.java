import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        Map<String, Function<List<Integer>, List<Integer>>> functions = new HashMap<>();
        functions.put("add", e -> e.stream().map(val -> val + 1).collect(Collectors.toList()));
        functions.put("multiply", e -> e.stream().map(val -> val * 2).collect(Collectors.toList()));
        functions.put("subtract", e -> e.stream().map(val -> val - 1).collect(Collectors.toList()));
        functions.put("print", e -> e.stream().peek(val -> System.out.print(val + " ")).collect(Collectors.toList()));
        handleInput(functions, scanner, input, numbers);

    }

    private static void handleInput(Map<String, Function<List<Integer>, List<Integer>>> functions, Scanner scanner, String input, List<Integer> numbers) {
        if (input.equals("end")) {
            return;
        }
        numbers = functions.get(input).apply(numbers);
        if ("print".equals(input)) {
            System.out.println();
        }
        input = scanner.nextLine();
        handleInput(functions, scanner, input, numbers);
    }
}
