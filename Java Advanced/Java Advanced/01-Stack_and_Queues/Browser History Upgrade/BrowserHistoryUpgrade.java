import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> forward = new ArrayDeque<>();
        ArrayDeque<String> history = new ArrayDeque<>();
        while (true) {
            String line = scanner.nextLine();
            String output;
            switch (line) {
                case "back":
                    if (history.size() <= 1) {
                        output = "no previous URLs";
                    } else {
                        forward.addFirst(history.pop());
                        output = history.peek();
                    }
                    break;
                case "forward":
                    if (forward.size() <= 0) {
                        output = "no next URLs";
                    } else {
                        history.push(forward.poll());
                        output = history.peek();
                    }
                    break;
                case "Home":
                    return;
                default:
                    output = line;
                    history.push(line);
                    forward.clear();
            }
            System.out.println(output);
        }
    }
}