import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input;
        while (!"end".equals(input = scanner.nextLine())) {
            String[] command = input.split("\\s+");
            String commandType = command[0];
            switch (commandType) {
                case "Contains":
                    int numContains = Integer.parseInt(command[1]);
                    if (numbers.contains(numContains)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    printEvenOdd(numbers, command[1]);
                    break;
                case "Get":
                    int sum = 0;
                    for (int num : numbers) {
                        sum += num;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    System.out.println(filter(numbers, command[1], command[2]).toString().replaceAll("[\\[\\],]", ""));

                    break;
            }
        }
    }

    private static void printEvenOdd(List<Integer> numbers, String evenOrOdd) {
        List<Integer> newNumbers = new ArrayList<>();
        for (Integer number : numbers) {

            if ("even".equals(evenOrOdd)) {
                if (number % 2 == 0) {
                    newNumbers.add(number);
                }
            } else if ("odd".equals(evenOrOdd)) {
                if (number % 2 == 1) {
                    newNumbers.add(number);
                }
            }
        }
        System.out.println(newNumbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<Integer> filter(List<Integer> numbers, String condition, String number) {
        List<Integer> newNumbers = new ArrayList<>();
        int num = Integer.parseInt(number);
        for (int numi : numbers) {
            switch (condition) {
                case "<":
                    if (numi < num) {
                        newNumbers.add(numi);
                    }
                    break;
                case ">":
                    if (numi > num) {
                        newNumbers.add(numi);
                    }
                    break;
                case "<=":
                    if (numi <= num) {
                        newNumbers.add(numi);
                    }
                    break;
                case ">=":
                    if (numi >= num) {
                        newNumbers.add(numi);
                    }
                    break;
            }
        }

        return newNumbers;
    }
}
