import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfOperations = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();
        ArrayDeque<String> sbHistory = new ArrayDeque();
        while (numberOfOperations-- > 0) {
            String[] inputParams = scanner.nextLine().split(" ");
            String cmd = inputParams[0];
            String value = inputParams.length > 1 ? inputParams[1] : null;
            switch (cmd) {
                case "1":
                    sbHistory.push(sb.toString());
                    sb.append(value);
                    break;
                case "2":
                    sbHistory.push(sb.toString());
                    int index = sb.length() - Integer.parseInt(value);
                    sb.delete(index, sb.length());
                    break;
                case "3":
                    System.out.println(sb.substring(Integer.parseInt(value) - 1, Integer.parseInt(value)));
                    break;
                case "4":
                    sb = new StringBuilder(sbHistory.pop());
                    break;
            }
        }
    }
}
