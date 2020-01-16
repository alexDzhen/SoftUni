import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Deque<String> queue = new ArrayDeque<>();
        while (!"print".equals(input = scanner.nextLine())) {
            if ("cancel".equals(input)) {
                if (queue.size() < 1) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.pollFirst());
                }
            } else {
                queue.offer(input);
            }
        }
        while (queue.size() > 0) {
            System.out.println(queue.pollFirst());
        }
    }
}
