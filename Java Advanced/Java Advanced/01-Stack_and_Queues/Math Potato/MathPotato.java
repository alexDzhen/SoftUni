import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String childName = readChildNames(scanner);
        String[] splitChildren = childName.split("\\s+");
        int tossesToRemoveOn = readN(scanner);
        Deque<String> queue = new ArrayDeque<>(Arrays.asList(splitChildren));
        int currentRound = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < tossesToRemoveOn; i++) {
                queue.offer(queue.poll());
            }
            if (isPrime(currentRound)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            currentRound++;
        }
        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int currentRound) {
        if (currentRound == 0 || currentRound == 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(currentRound); i++) {
                if (currentRound % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int readN(Scanner scanner) {
        return scanner.nextInt();
    }

    private static String readChildNames(Scanner scanner) {
        return scanner.nextLine();
    }
}
