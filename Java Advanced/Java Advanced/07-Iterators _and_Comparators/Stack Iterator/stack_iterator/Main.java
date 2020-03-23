package stack_iterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackIterator<Integer> stack = new StackIterator<>();
        Arrays.stream(scanner.nextLine().split("[, ]+")).skip(1).mapToInt(Integer::parseInt).forEach(stack::push);
        String input;
        while (!"END".equals(input = scanner.nextLine())) {
            if ("Pop".equals(input)) {
                try {
                    stack.pop();
                } catch (IndexOutOfBoundsException ex) {
                    System.out.println(ex.getMessage());
                }
            } else {
                int number = Integer.parseInt(input.substring(input.indexOf(" ") + 1));
                stack.push(number);
            }
        }
        stack.forEach(System.out::println);
        stack.forEach(System.out::println);
    }
}
