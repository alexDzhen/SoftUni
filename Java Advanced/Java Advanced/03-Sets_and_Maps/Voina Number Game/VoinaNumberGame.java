import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> firstPlayerCards = addSet(scanner);
        Set<Integer> secondPlayerCards = addSet(scanner);
        int counter = 1;
        while (counter++ < 50 && !firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {
            int firstNumber = firstPlayerCards.iterator().next();
            firstPlayerCards.remove(firstNumber);
            int secondNumber = secondPlayerCards.iterator().next();
            secondPlayerCards.remove(secondNumber);
            if (firstNumber > secondNumber) {
                firstPlayerCards.add(firstNumber);
                firstPlayerCards.add(secondNumber);
            } else if (secondNumber > firstNumber) {
                secondPlayerCards.add(firstNumber);
                secondPlayerCards.add(secondNumber);
            }
        }
        if (firstPlayerCards.size() < secondPlayerCards.size()) {
            System.out.println("Second player win!");
        } else if (secondPlayerCards.size() < firstPlayerCards.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Draw!");
        }

    }

    private static LinkedHashSet<Integer> addSet(Scanner scanner) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        String[] line = scanner.nextLine().split(" ");
        for (String s : line) {
            int num = Integer.parseInt(s);
            set.add(num);
        }
        return set;
    }
}
