import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input;
        while (!"End".equals(input = scanner.nextLine())) {
            String[] command = input.split("\\s+");
            String type = command[0];
            switch (type) {
                case "Add":
                    int numberAdd = Integer.parseInt(command[1]);
                    numbers.add(numberAdd);
                    break;
                case "Insert":
                    int numberInsert = Integer.parseInt(command[1]);
                    int indexInsert = Integer.parseInt(command[2]);
                    if (indexInsert >= 0 && indexInsert < numbers.size()) {
                        numbers.add(indexInsert, numberInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexRemove = Integer.parseInt(command[1]);
                    if (indexRemove >= 0 && indexRemove < numbers.size()) {
                        numbers.remove(indexRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String way = command[1];
                    int count = Integer.parseInt(command[2]);
                    if (way.equals("left")) {
                        shiftLeft(numbers, count);
                    } else if (way.equals("right")) {
                        shiftRight(numbers, count);
                    }
                    break;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void shiftRight(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            int temp = numbers.get(numbers.size() - 1);
            for (int j = numbers.size() - 1; j > 0; j--) {
                numbers.set(j, numbers.get(j - 1));
            }
            numbers.set(0, temp);
        }
    }

    private static void shiftLeft(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            int temp = numbers.get(0);
            for (int j = 0; j < numbers.size() - 1; j++) {
                numbers.set(j, numbers.get(j + 1));
            }
            numbers.set(numbers.size() - 1, temp);
        }
    }
}
