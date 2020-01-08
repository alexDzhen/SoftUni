import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firsPlayer = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        while (firsPlayer.size() > 0 && secondPlayer.size() > 0) {
            int firstPlayerCard = firsPlayer.remove(0);
            int secondPlayerCard = secondPlayer.remove(0);
            if (firstPlayerCard > secondPlayerCard) {
                firsPlayer.add(firstPlayerCard);
                firsPlayer.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayer.add(secondPlayerCard);
                secondPlayer.add(firstPlayerCard);
            }
        }
        if (firsPlayer.size() > 0) {
            sumPrint(firsPlayer, "First");
        } else {
            sumPrint(secondPlayer, "Second");
        }
    }

    private static void sumPrint(List<Integer> winner, String name) {
        int sum = 0;
        for (int points : winner) {
            sum += points;
        }
        System.out.println(String.format("%s player wins! Sum: %d", name, sum));
    }
}
